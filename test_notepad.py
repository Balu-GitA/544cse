import os

try:
    os.startfile("notepad.exe")
    print("✅ Notepad opened successfully!")
except Exception as e:
    print("❌ Error:", e)
