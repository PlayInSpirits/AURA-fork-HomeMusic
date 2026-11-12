.class public final Lii2;
.super Lcg3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcg3;"
    }
.end annotation


# instance fields
.field public m0:I

.field public n0:Lze4;

.field public o0:Ldy;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcg3;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lii2;->m0:I

    .line 15
    .line 16
    const-string v0, "DATE_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lze4;

    .line 23
    .line 24
    iput-object v0, p0, Lii2;->n0:Lze4;

    .line 25
    .line 26
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ldy;

    .line 33
    .line 34
    iput-object p1, p0, Lii2;->o0:Ldy;

    .line 35
    .line 36
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v3, v0, Lii2;->m0:I

    .line 10
    .line 11
    invoke-direct {v1, v2, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p1

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v3, v0, Lii2;->n0:Lze4;

    .line 21
    .line 22
    iget-object v7, v0, Lii2;->o0:Ldy;

    .line 23
    .line 24
    new-instance v8, Lwh2;

    .line 25
    .line 26
    const/4 v10, 0x1

    .line 27
    invoke-direct {v8, v10, v0}, Lwh2;-><init>(ILkc1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const v0, 0x7f0d0101

    .line 34
    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    move-object/from16 v2, p2

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const v1, 0x7f0a03f9

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v6, v1

    .line 51
    check-cast v6, Lcom/google/android/material/textfield/TextInputLayout;

    .line 52
    .line 53
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 58
    .line 59
    const-string v4, ""

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 64
    .line 65
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v5, v4

    .line 71
    :goto_0
    const-string v9, "lge"

    .line 72
    .line 73
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_2

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 82
    .line 83
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object v2, v4

    .line 89
    :goto_1
    const-string v5, "samsung"

    .line 90
    .line 91
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    :cond_2
    const/16 v2, 0x11

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 100
    .line 101
    .line 102
    :cond_3
    sget-object v2, La35;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 103
    .line 104
    const/4 v2, 0x3

    .line 105
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v2, v5}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/text/SimpleDateFormat;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string v5, "[^dMy/\\-.]"

    .line 120
    .line 121
    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-string v5, "d{1,2}"

    .line 126
    .line 127
    const-string v9, "dd"

    .line 128
    .line 129
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const-string v5, "M{1,2}"

    .line 134
    .line 135
    const-string v9, "MM"

    .line 136
    .line 137
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const-string v5, "y{1,4}"

    .line 142
    .line 143
    const-string v9, "yyyy"

    .line 144
    .line 145
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const-string v5, "\\.$"

    .line 150
    .line 151
    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const-string v4, "My"

    .line 156
    .line 157
    const-string v5, "M/y"

    .line 158
    .line 159
    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 164
    .line 165
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-direct {v5, v2, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 170
    .line 171
    .line 172
    const-string v2, "UTC"

    .line 173
    .line 174
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v5, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v11}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v5}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const v9, 0x7f1303a2

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    const v12, 0x7f1303a1

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    const v13, 0x7f1303a0

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-virtual {v13}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    sget-object v14, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    .line 222
    .line 223
    invoke-virtual {v14}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    const-string v14, "y"

    .line 232
    .line 233
    const-string v15, "M"

    .line 234
    .line 235
    move/from16 p0, v11

    .line 236
    .line 237
    const-string v11, "d"

    .line 238
    .line 239
    if-eqz v13, :cond_4

    .line 240
    .line 241
    const-string v13, "d+"

    .line 242
    .line 243
    invoke-virtual {v4, v13, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    const-string v13, "M+"

    .line 248
    .line 249
    invoke-virtual {v4, v13, v15}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    const-string v13, "y+"

    .line 254
    .line 255
    invoke-virtual {v4, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    :cond_4
    invoke-virtual {v4, v11, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2, v15, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v2, v14, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v6, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 272
    .line 273
    .line 274
    iget-object v2, v3, Lze4;->n:Ljava/lang/Long;

    .line 275
    .line 276
    if-eqz v2, :cond_5

    .line 277
    .line 278
    invoke-virtual {v5, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    :cond_5
    new-instance v2, Lye4;

    .line 286
    .line 287
    move-object v9, v6

    .line 288
    invoke-direct/range {v2 .. v9}, Lye4;-><init>(Lze4;Ljava/lang/String;Ljava/text/SimpleDateFormat;Lcom/google/android/material/textfield/TextInputLayout;Ldy;Lwh2;Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 292
    .line 293
    .line 294
    filled-new-array {v1}, [Landroid/widget/EditText;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    new-instance v2, Lp30;

    .line 299
    .line 300
    invoke-direct {v2, v10, v1}, Lp30;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    aget-object v3, v1, p0

    .line 304
    .line 305
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 306
    .line 307
    .line 308
    aget-object v1, v1, p0

    .line 309
    .line 310
    new-instance v2, Lni0;

    .line 311
    .line 312
    move/from16 v3, p0

    .line 313
    .line 314
    invoke-direct {v2, v1, v3}, Lni0;-><init>(Landroid/view/View;I)V

    .line 315
    .line 316
    .line 317
    const-wide/16 v3, 0x64

    .line 318
    .line 319
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 320
    .line 321
    .line 322
    return-object v0
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lii2;->m0:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "DATE_SELECTOR_KEY"

    .line 9
    .line 10
    iget-object v1, p0, Lii2;->n0:Lze4;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 16
    .line 17
    iget-object p0, p0, Lii2;->o0:Ldy;

    .line 18
    .line 19
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
