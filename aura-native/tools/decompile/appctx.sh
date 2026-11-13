#!/bin/bash
# Compile good set + excluded app units (best fixed variant) with ECJ; log to appex.log
W=/tmp/claude-0/-home-user/fce2dc1e-519e-59e5-8f6a-b4e106e7c493/scratchpad; cd $W
: > appex-files.txt
for u in $(cat appex.txt); do
  for r in manual jadx-fix jadx-out/sources cfr-out; do if [ -f $r/$u ]; then echo $W/$r/$u >> appex-files.txt; break; fi; done
done
grep -v -F -f appex.txt ens8/list.txt > ctx.txt; cat appex-files.txt >> ctx.txt
java -Xmx6g -jar tools/ecj.jar -1.8 -nowarn -proceedOnError -encoding UTF-8 -d none -cp tools/stubs.jar -bootclasspath tools/android-37.jar @ctx.txt > appex.log 2>&1
echo "app files with errors: $(grep -oE 'ERROR in \S+eddyizm\S+' appex.log | sort -u | wc -l), errors: $(grep -c 'ERROR in .*eddyizm' appex.log), non-app errors: $(grep 'ERROR in' appex.log | grep -vc eddyizm)"
