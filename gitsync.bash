#!/bin/bash
if [ $# -eq 0 ]; then
    echo “Gitsync Usage: gitsync [repo folder name] [message] or use current repo with gitsync t [message]"
    exit 1
fi
cd /Users/javastudent1/Documents/workspace/
git pull
git status
git add --all .
git commit -m "${*:2}"
git push
echo "github sync sucussful"

exit 1