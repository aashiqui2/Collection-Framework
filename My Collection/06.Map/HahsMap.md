Sure, let's **visualize how load factor affects a HashMap** using a **bucket table diagram**!

We'll go step by step, inserting elements into a `HashMap<String, Integer>` with:

* Initial **capacity = 4**
* **Load factor = 0.75**

So, **threshold = 4 × 0.75 = 3**

---

### 🔹 Step 1: Add "A" → 1

🪣 Buckets (Capacity = 4):

```
Index:     0       1       2       3
          [ ]     [A:1]   [ ]     [ ]
```

✅ Total entries: 1 (below threshold 3) → **No resize**

---

### 🔹 Step 2: Add "B" → 2

```
Index:     0       1       2       3
          [ ]     [A:1]   [B:2]   [ ]
```

✅ Total entries: 2 (still below threshold) → **No resize**

---

### 🔹 Step 3: Add "C" → 3

```
Index:     0       1       2       3
         [C:3]   [A:1]   [B:2]   [ ]
```

✅ Total entries: 3 (equal to threshold) → **Still no resize**

---

### 🔹 Step 4: Add "D" → 4

❗ Threshold = 3, and we now have 4 elements ➝ **resize needed**

➡️ **Resize** capacity from 4 ➝ 8
➡️ **Rehash** all existing elements

---

### 🔁 After Resize (Capacity = 8):

```
Index:     0       1       2       3       4       5       6       7
         [A:1]   [ ]     [B:2]   [ ]     [C:3]   [ ]     [D:4]   [ ]
```

✅ All entries are **redistributed** to new bucket positions based on new hash calculations.

---

### 📌 What You Learned

* **Load Factor = 0.75** means rehashing happens when map is **75% full**.
* Resize is **automatic** and **costly** (CPU-wise), so load factor affects performance.
* After resizing, the **capacity doubles**, and elements are **rehashed**.

---

Would you like me to generate a **graphical image** of this bucket table as well?
