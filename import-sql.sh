#!/bin/bash

psql -lqt | cut -d \| -f 1 | grep -qw tierlist
tierlistExit=$?
if [ $tierlistExit -eq 0 ]
then 
	echo "La base de donnee existe deja.."
	psql tierlist < tierlist.sql 
else 
	echo "La base de donnee n'existe pas, création en cours..."
	createdb tierlist
	echo "Création de la BDD -> OK"
	psql tierlist < tierlist.sql 
fi 
