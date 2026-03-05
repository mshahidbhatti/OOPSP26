@echo off
setlocal EnableExtensions

REM --- Go to repo ---
cd /d C:\OOPSP26
if errorlevel 1 (
  echo ERROR: Cannot access C:\OOPSP26
  pause
  exit /b 1
)

REM --- Check git repo ---
if not exist ".git\" (
  echo ERROR: C:\OOPSP26 is not a git repository (.git not found).
  pause
  exit /b 1
)

echo.
echo ===== Git Status (before) =====
git status
echo.

REM --- Read custom message ---
set /p "MSG=Enter commit message: "
if "%MSG%"=="" set "MSG=Update"

REM --- Get date+time stamp (seconds included) ---
for /f %%i in ('powershell -NoProfile -Command "Get-Date -Format yyyy-MM-dd_HH-mm-ss"') do set "DT=%%i"

REM --- Stage all changes ---
git add -A

REM --- If nothing staged, exit gracefully ---
git diff --cached --quiet
if errorlevel 1 (
  git commit -m "%MSG% [%DT%]"
  git push
  echo.
  echo Done.
) else (
  echo.
  echo Nothing to commit. No staged changes found.
)

pause
endlocal