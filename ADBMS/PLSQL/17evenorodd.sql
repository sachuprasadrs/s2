declare
n integer;
begin
n:=&n;
if mod(n,2)=0
then
dbms_output.put_line('the number is even');
else
dbms_output.put_line('the number is odd');
end if;
end;
/
