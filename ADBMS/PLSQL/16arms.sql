declare
n integer;
temp integer;
r integer;
s integer:=0;
begin
    
    n:=&n;
    temp := n;
while temp > 0 loop
        r := mod(temp, 10);
        s := s + r * r * r;
        temp := floor(temp / 10);
    end loop;
if s = n then
   dbms_output.put_line(n || ' is an Armstrong number.');
    else
        dbms_output.put_line(n || ' is NOT an Armstrong number.');
    end if;
end;
/
