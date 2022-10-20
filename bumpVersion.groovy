def bump(int major, int minor, int patch) {
    switch (patch) {
        case 9:
            if (minor >= 99) {
                bumpPatch = 0
                bumpMinor = 0
                bumpMajor = major + 1
                bumped = "${bumpMajor}.${bumpMinor}.${bumpPatch}"
            } else {
                bumpPatch = 0
                bumpMinor = minor + 1
                bumpMajor = major
                bumped = "${bumpMajor}.${bumpMinor}.${bumpPatch}"
            }
            return bumped
        default:
            bumpPatch = patch + 1
            bumpMinor = minor
            bumpMajor = major
            return "${bumpMajor}.${bumpMinor}.${bumpPatch}"
    }
}

/*
Example:

int lastMajor = 1
int lastMinor = 99
int lastPatch = 9
printf( bump(lastMajor, lastMinor, lastPatch) )

output:
2.0.0
 */