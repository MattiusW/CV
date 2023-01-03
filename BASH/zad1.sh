#Napisz skrypt powłoki, który uruchomiony z pewną ilością argumentów, które są liczbami całkowitymi wypisze na standardowe wyjście ich sumę. W skrypcie wykorzystaj polecenie shift.

if [[ $1 -ge 0 && $2 -ge 0 ]]
then
   suma=$[$1 + $2];
   shift;
else
   echo "Podaj liczby calkowie";
fi
echo $suma;
