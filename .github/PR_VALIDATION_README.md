# PR Template Validation Setup

This repository uses automated PR validation to ensure all required checks are completed before merging.

## What Gets Validated

The PR validation workflow checks for:

### Required Checkboxes (must be checked with `[x]`)
- ✅ Project builds successfully without errors
- ✅ All tests pass locally
- ✅ Code follows project style guidelines
- ✅ Self-review performed
- ✅ All new and existing tests passed locally

### Required Evidence (must contain actual content, not placeholders)
- **Build Output/Screenshot**: Must include actual build confirmation or screenshot
- **Coverage Details**: Must include actual test coverage report or screenshot
- **Schema Changes**: At least one option must be selected, and if changes are made, description and migration script must be provided

## Setup Instructions

### 1. Enable Branch Protection Rules

Go to your repository settings → Branches → Add rule:

- **Branch name pattern**: `main` (or your default branch)
- **Require status checks to pass before merging**: ✅ Enabled
- **Status checks found in the last week for this repository**:
  - Select: `validate-pr-template`
- **Require branches to be up to date before merging**: ✅ Enabled (recommended)

### 2. Configure Required Reviews (Optional but Recommended)

- **Require pull request reviews before merging**: ✅ Enabled
- **Required approving reviews**: 1 (or your team preference)
- **Dismiss stale pull request approvals when new commits are pushed**: ✅ Enabled

### 3. Additional Settings (Recommended)

- **Require status checks to pass before merging**: ✅ (already enabled above)
- **Require branches to be up to date before merging**: ✅
- **Include administrators**: ✅ (enforce rules for admins too)
- **Restrict pushes that create matching branches**: ❌ (allow creating branches)
- **Allow force pushes**: ❌ (prevent force pushes to protected branches)
- **Allow deletions**: ❌ (prevent branch deletions)

## How It Works

1. When a PR is opened or updated, the validation workflow runs automatically
2. The workflow checks the PR description against the template requirements
3. If any requirements are missing, the PR status shows as "failing"
4. The PR cannot be merged until all requirements are met
5. Reviewers will see clear error messages indicating what's missing

## Troubleshooting

### PR Shows as Failing But I Think It's Complete
- Check that all required checkboxes are marked with `[x]` (not `[ ]`)
- Ensure evidence sections contain actual content (not placeholder text)
- Verify the PR description follows the template format

### Validation Workflow Not Running
- Make sure the workflow file is in `.github/workflows/pr-validation.yml`
- Check repository settings to ensure workflows are enabled
- Verify the workflow has proper permissions

### Need to Bypass Validation (Emergency Only)
- Repository admins can temporarily disable branch protection
- Use "Merge without waiting for requirements" option (if enabled)
- Contact repository maintainers for urgent merges

## Customization

To modify validation rules, edit:
- `.github/workflows/pr-validation.yml` - validation logic
- `.github/PULL_REQUEST_TEMPLATE.md` - template and requirements