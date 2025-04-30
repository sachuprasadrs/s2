DECLARE
    num INTEGER;
    i INTEGER;
    is_prime BOOLEAN;
BEGIN
    FOR num IN 2..100 LOOP
        is_prime := TRUE;
        FOR i IN 2..num/2 LOOP
            IF num MOD i = 0 THEN
                is_prime := FALSE;
                EXIT;
            END IF;
        END LOOP;
        IF is_prime THEN
            DBMS_OUTPUT.PUT_LINE(num);
        END IF;
    END LOOP;
END;
/

