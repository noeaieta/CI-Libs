#!/bin/bash

NUMARG=$#
#numero de argumentos necesarios para correr el script
CANARG="5"
#carpeta que utiliza
FOLDER='/data'
LOG='log'
INFO="$FOLDER/info"
REPORT="$FOLDER/$LOG/reporte.txt"
REPORT_TYPE="$FOLDER/$LOG/repote_type.txt"
FLAG="$INFO/flag.txt"

#declaracion de funciones
function set_debbug()
{
    #habilito el debbug
    set -xe
}

function get_flag()
{
	#busca flags para activar acciones
    FF=$(cat $1)
    echo $FF
}

#funcion base del programa
function main()
{
	#verifico para activar el debbuger
    if [[ $(get_flag $FLAG) == "1" ]]; then set_debbug ; fi
    
    echo "hola mundo"
}


#empieza el programa
if [ $NUMARG == $CANARG ]; then
    #empiza a ejecutar el main
    main
else
    RR=$((CANARG - NUMARG))
    
    #genero reporte con el error
    echo "1" > $REPORT_TYPE
    echo "$0 -- estan faltando $RR argumentos para iniciar el script" > $REPORT
fi

#que siempre termine en exit 0 para evitar fails en cadena
exit 0