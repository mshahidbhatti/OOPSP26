from pathlib import Path

ROOT = Path(r"C:\OOPSP26")

count = 0
for d in ROOT.rglob("*"):
    if d.is_dir() and d.name != ".git":
        # folder is empty if it has no children
        if not any(d.iterdir()):
            (d / ".gitkeep").write_text("", encoding="utf-8")
            count += 1

print(f"Added .gitkeep to {count} empty folders.")
