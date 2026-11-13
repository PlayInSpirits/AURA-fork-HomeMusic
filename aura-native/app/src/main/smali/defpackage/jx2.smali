.class public final Ldefpackage/jx2;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final s:I

.field public static final t:I


# instance fields
.field public final n:Ldefpackage/ix2;

.field public final o:Ldefpackage/ze4;

.field public p:Ljava/util/ArrayList;

.field public q:Ldefpackage/ey;

.field public final r:Ldefpackage/dy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ldefpackage/a35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getMaximum(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sput v1, Ldefpackage/jx2;->s:I

    .line 12
    .line 13
    invoke-static {v0}, Ldefpackage/a35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x5

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getMaximum(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0}, Ldefpackage/a35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v2, 0x7

    .line 27
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->getMaximum(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v0, v1

    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    sput v0, Ldefpackage/jx2;->t:I

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Ldefpackage/ix2;Ldefpackage/ze4;Ldefpackage/dy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/jx2;->o:Ldefpackage/ze4;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/jx2;->r:Ldefpackage/dy;

    .line 9
    .line 10
    invoke-virtual {p2}, Ldefpackage/ze4;->a()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ldefpackage/jx2;->p:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/jx2;->r:Ldefpackage/dy;

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/dy;->r:I

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ix2;->n:Ljava/util/Calendar;

    .line 8
    .line 9
    const/4 v2, 0x7

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v1}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    sub-int/2addr v2, v0

    .line 22
    if-gez v2, :cond_1

    .line 23
    .line 24
    iget p0, p0, Ldefpackage/ix2;->q:I

    .line 25
    .line 26
    add-int/2addr v2, p0

    .line 27
    :cond_1
    return v2
.end method

.method public final b(I)Ljava/lang/Long;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/jx2;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt p1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/jx2;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-le p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ldefpackage/jx2;->a()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sub-int/2addr p1, v0

    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/ix2;->n:Ljava/util/Calendar;

    .line 24
    .line 25
    invoke-static {p0}, Ldefpackage/a35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v0, 0x5

    .line 30
    invoke-virtual {p0, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public final c()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/jx2;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 6
    .line 7
    iget p0, p0, Ldefpackage/ix2;->r:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    return v0
.end method

.method public final d(Landroid/widget/TextView;J)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {}, Ldefpackage/a35;->d()Ljava/util/Calendar;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    cmp-long v1, v1, p2

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v1, v2

    .line 25
    :goto_0
    iget-object v4, p0, Ldefpackage/jx2;->o:Ldefpackage/ze4;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v5, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    move v7, v2

    .line 40
    :cond_2
    if-ge v7, v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    add-int/lit8 v7, v7, 0x1

    .line 47
    .line 48
    check-cast v8, Ldefpackage/ld3;

    .line 49
    .line 50
    iget-object v8, v8, Ldefpackage/ld3;->a:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz v8, :cond_2

    .line 53
    .line 54
    check-cast v8, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    cmp-long v8, v8, p2

    .line 61
    .line 62
    if-nez v8, :cond_2

    .line 63
    .line 64
    move v5, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move v5, v2

    .line 67
    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    move v8, v2

    .line 77
    :cond_4
    if-ge v8, v7, :cond_5

    .line 78
    .line 79
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    add-int/lit8 v8, v8, 0x1

    .line 84
    .line 85
    check-cast v9, Ldefpackage/ld3;

    .line 86
    .line 87
    iget-object v9, v9, Ldefpackage/ld3;->b:Ljava/lang/Object;

    .line 88
    .line 89
    if-eqz v9, :cond_4

    .line 90
    .line 91
    check-cast v9, Ljava/lang/Long;

    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    cmp-long v9, v9, p2

    .line 98
    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    move v6, v3

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move v6, v2

    .line 104
    :goto_2
    invoke-static {}, Ldefpackage/a35;->d()Ljava/util/Calendar;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    const/4 v8, 0x0

    .line 109
    invoke-static {v8}, Ldefpackage/a35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v8, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-virtual {v8, v3}, Ljava/util/Calendar;->get(I)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-ne v7, v8, :cond_6

    .line 125
    .line 126
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    const-string v8, "MMMMEEEEd"

    .line 131
    .line 132
    invoke-static {v8, v7}, Ldefpackage/a35;->b(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    new-instance v8, Ljava/util/Date;

    .line 137
    .line 138
    invoke-direct {v8, p2, p3}, Ljava/util/Date;-><init>(J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v8}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    const-string v8, "yMMMMEEEEd"

    .line 151
    .line 152
    invoke-static {v8, v7}, Ldefpackage/a35;->b(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    new-instance v8, Ljava/util/Date;

    .line 157
    .line 158
    invoke-direct {v8, p2, p3}, Ljava/util/Date;-><init>(J)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7, v8}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    :goto_3
    if-eqz v1, :cond_7

    .line 166
    .line 167
    const v1, 0x7f1303a3

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-static {v1, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    :cond_7
    if-eqz v5, :cond_8

    .line 183
    .line 184
    const v1, 0x7f13039c

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    goto :goto_4

    .line 200
    :cond_8
    if-eqz v6, :cond_9

    .line 201
    .line 202
    const v1, 0x7f13038e

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    :cond_9
    :goto_4
    invoke-virtual {p1, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Ldefpackage/jx2;->r:Ldefpackage/dy;

    .line 221
    .line 222
    iget-object v0, v0, Ldefpackage/dy;->p:Ldefpackage/pi0;

    .line 223
    .line 224
    iget-wide v0, v0, Ldefpackage/pi0;->n:J

    .line 225
    .line 226
    cmp-long v0, p2, v0

    .line 227
    .line 228
    if-ltz v0, :cond_f

    .line 229
    .line 230
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4}, Ldefpackage/ze4;->a()Ljava/util/ArrayList;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    move v4, v2

    .line 242
    :cond_a
    if-ge v4, v1, :cond_b

    .line 243
    .line 244
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    add-int/lit8 v4, v4, 0x1

    .line 249
    .line 250
    check-cast v5, Ljava/lang/Long;

    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 253
    .line 254
    .line 255
    move-result-wide v5

    .line 256
    invoke-static {p2, p3}, Ldefpackage/a35;->a(J)J

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    invoke-static {v5, v6}, Ldefpackage/a35;->a(J)J

    .line 261
    .line 262
    .line 263
    move-result-wide v5

    .line 264
    cmp-long v5, v7, v5

    .line 265
    .line 266
    if-nez v5, :cond_a

    .line 267
    .line 268
    move v0, v3

    .line 269
    goto :goto_5

    .line 270
    :cond_b
    move v0, v2

    .line 271
    :goto_5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 272
    .line 273
    .line 274
    if-eqz v0, :cond_c

    .line 275
    .line 276
    iget-object p0, p0, Ldefpackage/jx2;->q:Ldefpackage/ey;

    .line 277
    .line 278
    iget-object p0, p0, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p0, Ldefpackage/c6;

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_c
    invoke-static {}, Ldefpackage/a35;->d()Ljava/util/Calendar;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 288
    .line 289
    .line 290
    move-result-wide v0

    .line 291
    cmp-long p2, v0, p2

    .line 292
    .line 293
    if-nez p2, :cond_d

    .line 294
    .line 295
    move v2, v3

    .line 296
    :cond_d
    iget-object p0, p0, Ldefpackage/jx2;->q:Ldefpackage/ey;

    .line 297
    .line 298
    if-eqz v2, :cond_e

    .line 299
    .line 300
    iget-object p0, p0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast p0, Ldefpackage/c6;

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_e
    iget-object p0, p0, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast p0, Ldefpackage/c6;

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_f
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 311
    .line 312
    .line 313
    iget-object p0, p0, Ldefpackage/jx2;->q:Ldefpackage/ey;

    .line 314
    .line 315
    iget-object p0, p0, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast p0, Ldefpackage/c6;

    .line 318
    .line 319
    :goto_6
    invoke-virtual {p0, p1}, Ldefpackage/c6;->A(Landroid/widget/TextView;)V

    .line 320
    .line 321
    .line 322
    return-void
.end method

.method public final e(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ldefpackage/ix2;->c(J)Ldefpackage/ix2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ldefpackage/ix2;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v1, Ldefpackage/ix2;->n:Ljava/util/Calendar;

    .line 14
    .line 15
    invoke-static {v0}, Ldefpackage/a35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Ldefpackage/jx2;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    invoke-virtual {v1}, Ldefpackage/jx2;->a()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v1, v0

    .line 38
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sub-int/2addr v1, v0

    .line 43
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/jx2;->d(Landroid/widget/TextView;J)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final getCount()I
    .locals 0

    .line 1
    sget p0, Ldefpackage/jx2;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/jx2;->b(I)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/ix2;->q:I

    .line 4
    .line 5
    div-int/2addr p1, p0

    .line 6
    int-to-long p0, p1

    .line 7
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/jx2;->q:Ldefpackage/ey;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ldefpackage/ey;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ldefpackage/ey;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Ldefpackage/jx2;->q:Ldefpackage/ey;

    .line 15
    .line 16
    :cond_0
    move-object v0, p2

    .line 17
    check-cast v0, Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    const p2, 0x7f0d00ec

    .line 23
    .line 24
    .line 25
    invoke-static {p3, p2, p3, v1}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    move-object v0, p2

    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Ldefpackage/jx2;->a()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    sub-int p2, p1, p2

    .line 37
    .line 38
    if-ltz p2, :cond_3

    .line 39
    .line 40
    iget-object p3, p0, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 41
    .line 42
    iget v2, p3, Ldefpackage/ix2;->r:I

    .line 43
    .line 44
    if-lt p2, v2, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v2, 0x1

    .line 48
    add-int/2addr p2, v2

    .line 49
    invoke-virtual {v0, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    iget-object p3, p3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 61
    .line 62
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const-string v3, "%d"

    .line 71
    .line 72
    invoke-static {p3, v3, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    :goto_0
    const/16 p2, 0x8

    .line 87
    .line 88
    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 92
    .line 93
    .line 94
    :goto_1
    invoke-virtual {p0, p1}, Ldefpackage/jx2;->b(I)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide p1

    .line 105
    invoke-virtual {p0, v0, p1, p2}, Ldefpackage/jx2;->d(Landroid/widget/TextView;J)V

    .line 106
    .line 107
    .line 108
    return-object v0
.end method

.method public final hasStableIds()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
