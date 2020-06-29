#!/bin/bash

# I have noticed there can be weird bugs with figwheel when you change the whole ns layout,
# lets clear out your target in case you have already built
rm -rf target

# Initially, old will be firemore-start-template, but this will be modified as you call
# this script.
old='firemore-start-template'
new=$1
underscored_old=$(sed 's/-/_/g' <<< $old)
underscored_new=$(sed 's/-/_/g' <<< $new)
grep -rl $old . --exclude-dir=.git | xargs sed -i "s/$old/$new/g"
mv src/$underscored_old src/$underscored_new
