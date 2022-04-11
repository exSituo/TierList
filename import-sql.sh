#!/bin/bash

psql -lqt | cut -d \| -f 1 | grep -qw tierlist
tierlistExit=$?
if [ $tierlistExit -eq 0 ]
then 
	echo "La base de donnee existe deja.."
	psql tierlist < tierlist.sql 
else 
	echo "La base de donnee n'existe pas"
	createdb tierlist
	psql tierlist < tierlist.sql 
fi 
