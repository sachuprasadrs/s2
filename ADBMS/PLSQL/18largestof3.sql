declare
a integer;
b integer;
c integer;
begin
a:=&a;
b:=&b;
c:=&c;
if a>b and a>c
then
dbms_output.put_line(a || 'is greater');
elsif b>a and b>c
then
dbms_output.put_line(b || 'is greater');
else
dbms_output.put_line(c || 'is greater');
end if;
end;
/
