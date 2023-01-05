#!/bin/bash

echo $$;                #glowny ID procesu
echo $$BASHPID;         #trzyma tez ID pod-pwlok (ang. subshell)
echo $BASH_SUBSHELL;    #jak gleboko jestesmy zagniezdzeni w powlokach

