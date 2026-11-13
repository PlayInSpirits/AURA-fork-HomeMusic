.class public Ldefpackage/ue1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/m31;
.implements Ldefpackage/kg1;
.implements Lretrofit2/Callback;
.implements Ldefpackage/ps;


# static fields
.field public static final r:Ldefpackage/mj0;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/mj0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/mj0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/ue1;->r:Ldefpackage/mj0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 277
    new-instance v0, Ldefpackage/f13;

    const/16 v1, 0x10

    new-array v1, v1, [Ldefpackage/f12;

    invoke-direct {v0, v1}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 278
    iput-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 295
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 p1, p1, 0x2

    .line 296
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 297
    iput p1, p0, Ldefpackage/ue1;->o:I

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 263
    iput p1, p0, Ldefpackage/ue1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 253
    iput p2, p0, Ldefpackage/ue1;->n:I

    iput-object p3, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    iput p1, p0, Ldefpackage/ue1;->o:I

    iput-object p4, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILdefpackage/iu4;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 273
    iput p1, p0, Ldefpackage/ue1;->o:I

    .line 274
    iput-object p2, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 275
    new-instance p1, Ldefpackage/be3;

    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    iput-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 270
    iput-object p2, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 271
    iput p3, p0, Ldefpackage/ue1;->o:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 261
    iput v0, p0, Ldefpackage/ue1;->o:I

    .line 262
    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/j02;Ldefpackage/lc3;)V
    .locals 12

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p2, p2, Ldefpackage/lc3;->a:Ldefpackage/ue1;

    .line 9
    .line 10
    iget v0, p1, Ldefpackage/h02;->n:I

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "negative nearestRange.first"

    .line 16
    .line 17
    invoke-static {v1}, Ldefpackage/fz1;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget p1, p1, Ldefpackage/h02;->o:I

    .line 21
    .line 22
    iget v1, p2, Ldefpackage/ue1;->o:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-ge p1, v0, :cond_1

    .line 31
    .line 32
    sget-object p1, Ldefpackage/r73;->a:Ldefpackage/p03;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    new-array p2, p1, [Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p2, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 43
    .line 44
    iput p1, p0, Ldefpackage/ue1;->o:I

    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_1
    sub-int v1, p1, v0

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    new-array v2, v1, [Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v2, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 55
    .line 56
    iput v0, p0, Ldefpackage/ue1;->o:I

    .line 57
    .line 58
    new-instance v2, Ldefpackage/p03;

    .line 59
    .line 60
    invoke-direct {v2, v1}, Ldefpackage/p03;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p2, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ldefpackage/f13;

    .line 66
    .line 67
    const-string v3, ", size "

    .line 68
    .line 69
    const-string v4, "Index "

    .line 70
    .line 71
    if-ltz v0, :cond_2

    .line 72
    .line 73
    iget v5, p2, Ldefpackage/ue1;->o:I

    .line 74
    .line 75
    if-ge v0, v5, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    iget v5, p2, Ldefpackage/ue1;->o:I

    .line 79
    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, Ldefpackage/fz1;->d(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    if-ltz p1, :cond_3

    .line 102
    .line 103
    iget v5, p2, Ldefpackage/ue1;->o:I

    .line 104
    .line 105
    if-ge p1, v5, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    iget p2, p2, Ldefpackage/ue1;->o:I

    .line 109
    .line 110
    new-instance v5, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-static {p2}, Ldefpackage/fz1;->d(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    if-lt p1, v0, :cond_4

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v3, "toIndex ("

    .line 137
    .line 138
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v3, ") should be not smaller than fromIndex ("

    .line 145
    .line 146
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v3, ")"

    .line 153
    .line 154
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-static {p2}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    invoke-static {v0, v1}, Ldefpackage/su3;->e(ILdefpackage/f13;)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iget-object v3, v1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 169
    .line 170
    aget-object v3, v3, p2

    .line 171
    .line 172
    check-cast v3, Ldefpackage/f12;

    .line 173
    .line 174
    iget v3, v3, Ldefpackage/f12;->a:I

    .line 175
    .line 176
    :goto_4
    if-gt v3, p1, :cond_8

    .line 177
    .line 178
    iget-object v4, v1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 179
    .line 180
    aget-object v4, v4, p2

    .line 181
    .line 182
    check-cast v4, Ldefpackage/f12;

    .line 183
    .line 184
    iget-object v5, v4, Ldefpackage/f12;->c:Ldefpackage/wo0;

    .line 185
    .line 186
    iget-object v5, v5, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v5, Ldefpackage/if1;

    .line 189
    .line 190
    iget v6, v4, Ldefpackage/f12;->a:I

    .line 191
    .line 192
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    iget v8, v4, Ldefpackage/f12;->b:I

    .line 197
    .line 198
    add-int/2addr v8, v6

    .line 199
    add-int/lit8 v8, v8, -0x1

    .line 200
    .line 201
    invoke-static {p1, v8}, Ljava/lang/Math;->min(II)I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-gt v7, v8, :cond_7

    .line 206
    .line 207
    :goto_5
    if-eqz v5, :cond_5

    .line 208
    .line 209
    sub-int v9, v7, v6

    .line 210
    .line 211
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-interface {v5, v9}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    if-nez v9, :cond_6

    .line 220
    .line 221
    :cond_5
    new-instance v9, Ldefpackage/ql0;

    .line 222
    .line 223
    invoke-direct {v9, v7}, Ldefpackage/ql0;-><init>(I)V

    .line 224
    .line 225
    .line 226
    :cond_6
    invoke-virtual {v2, v7, v9}, Ldefpackage/p03;->g(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object v10, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v10, [Ljava/lang/Object;

    .line 232
    .line 233
    iget v11, p0, Ldefpackage/ue1;->o:I

    .line 234
    .line 235
    sub-int v11, v7, v11

    .line 236
    .line 237
    aput-object v9, v10, v11

    .line 238
    .line 239
    if-eq v7, v8, :cond_7

    .line 240
    .line 241
    add-int/lit8 v7, v7, 0x1

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_7
    iget v4, v4, Ldefpackage/f12;->b:I

    .line 245
    .line 246
    add-int/2addr v3, v4

    .line 247
    add-int/lit8 p2, p2, 0x1

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    iput-object v2, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 251
    .line 252
    :goto_6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 254
    iput p4, p0, Ldefpackage/ue1;->n:I

    iput-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    iput p2, p0, Ldefpackage/ue1;->o:I

    iput-object p3, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;ILandroid/view/MotionEvent;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 257
    iput p2, p0, Ldefpackage/ue1;->o:I

    .line 258
    iput-object p3, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 259
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string p0, "changes cannot be empty"

    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/util/UUID;)V
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    sget-object v0, Ldefpackage/ax;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const-string v3, "Use C.CLEARKEY_UUID instead"

    invoke-static {v3, v1}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 282
    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 283
    new-instance v1, Landroid/media/MediaDrm;

    .line 284
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1b

    if-ge v3, v4, :cond_0

    sget-object v3, Ldefpackage/ax;->c:Ljava/util/UUID;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 285
    :goto_0
    invoke-direct {v1, v0}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V

    iput-object v1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 286
    iput v2, p0, Ldefpackage/ue1;->o:I

    .line 287
    sget-object p0, Ldefpackage/ax;->d:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 288
    const-string p0, "ASUS_Z00AD"

    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 289
    const-string p0, "securityLevel"

    const-string p1, "L3"

    invoke-virtual {v1, p0, p1}, Landroid/media/MediaDrm;->setPropertyString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Ldefpackage/ls2;Ldefpackage/fr2;I)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    iput p3, p0, Ldefpackage/ue1;->o:I

    return-void
.end method

.method public constructor <init>(Ldefpackage/nz2;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 265
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 266
    iput-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 267
    iput p1, p0, Ldefpackage/ue1;->o:I

    return-void
.end method

.method public constructor <init>(Ldefpackage/sd0;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 298
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 299
    new-instance v0, Ldefpackage/zg5;

    invoke-direct {v0, p0}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    const/16 v1, 0x96

    .line 300
    invoke-static {v1, v0}, Ldefpackage/s51;->a(ILdefpackage/q51;)Ldefpackage/i61;

    move-result-object v0

    iput-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 301
    iput-object p1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/si1;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Ldefpackage/ue1;->n:I

    .line 290
    sget-object v0, Ldefpackage/o10;->s:Ldefpackage/o10;

    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 292
    iput-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 293
    iput-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    const p1, 0x7fffffff

    .line 294
    iput p1, p0, Ldefpackage/ue1;->o:I

    return-void
.end method

.method public static g(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ldefpackage/ue1;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x2

    .line 19
    if-eq v4, v6, :cond_0

    .line 20
    .line 21
    if-eq v4, v5, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-ne v4, v6, :cond_22

    .line 25
    .line 26
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v7, "gradient"

    .line 34
    .line 35
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    const/4 v9, 0x0

    .line 40
    if-nez v8, :cond_2

    .line 41
    .line 42
    const-string v5, "selector"

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-static {v0, v2, v3, v1}, Ldefpackage/t50;->b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ldefpackage/ue1;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-direct {v1, v9, v0, v2}, Ldefpackage/ue1;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 65
    .line 66
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ": unsupported complex color tag "

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_21

    .line 103
    .line 104
    sget-object v4, Ldefpackage/mt3;->e:[I

    .line 105
    .line 106
    invoke-static {v0, v1, v3, v4}, Ldefpackage/gi1;->O(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    const-string v7, "http://schemas.android.com/apk/res/android"

    .line 111
    .line 112
    const-string v8, "startX"

    .line 113
    .line 114
    invoke-interface {v2, v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const/4 v10, 0x0

    .line 119
    if-eqz v8, :cond_3

    .line 120
    .line 121
    const/16 v8, 0x8

    .line 122
    .line 123
    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    move v12, v8

    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move v12, v10

    .line 130
    :goto_1
    const-string v8, "startY"

    .line 131
    .line 132
    invoke-interface {v2, v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-eqz v8, :cond_4

    .line 137
    .line 138
    const/16 v8, 0x9

    .line 139
    .line 140
    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    move v13, v8

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    move v13, v10

    .line 147
    :goto_2
    const-string v8, "endX"

    .line 148
    .line 149
    invoke-interface {v2, v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    if-eqz v8, :cond_5

    .line 154
    .line 155
    const/16 v8, 0xa

    .line 156
    .line 157
    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    move v14, v8

    .line 162
    goto :goto_3

    .line 163
    :cond_5
    move v14, v10

    .line 164
    :goto_3
    const-string v8, "endY"

    .line 165
    .line 166
    invoke-interface {v2, v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    if-eqz v8, :cond_6

    .line 171
    .line 172
    const/16 v8, 0xb

    .line 173
    .line 174
    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    move v15, v8

    .line 179
    goto :goto_4

    .line 180
    :cond_6
    move v15, v10

    .line 181
    :goto_4
    const-string v8, "centerX"

    .line 182
    .line 183
    invoke-interface {v2, v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    const/4 v11, 0x3

    .line 188
    if-eqz v8, :cond_7

    .line 189
    .line 190
    invoke-virtual {v4, v11, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    goto :goto_5

    .line 195
    :cond_7
    move v8, v10

    .line 196
    :goto_5
    const-string v9, "centerY"

    .line 197
    .line 198
    invoke-interface {v2, v7, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    if-eqz v9, :cond_8

    .line 203
    .line 204
    const/4 v9, 0x4

    .line 205
    invoke-virtual {v4, v9, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    goto :goto_6

    .line 210
    :cond_8
    move v9, v10

    .line 211
    :goto_6
    const-string v11, "type"

    .line 212
    .line 213
    invoke-interface {v2, v7, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    const/4 v10, 0x0

    .line 218
    if-eqz v11, :cond_9

    .line 219
    .line 220
    invoke-virtual {v4, v6, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    goto :goto_7

    .line 225
    :cond_9
    move v11, v10

    .line 226
    :goto_7
    const-string v6, "startColor"

    .line 227
    .line 228
    invoke-interface {v2, v7, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    if-eqz v6, :cond_a

    .line 233
    .line 234
    invoke-virtual {v4, v10, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    goto :goto_8

    .line 239
    :cond_a
    move v6, v10

    .line 240
    :goto_8
    const-string v5, "centerColor"

    .line 241
    .line 242
    invoke-interface {v2, v7, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v20

    .line 246
    if-eqz v20, :cond_b

    .line 247
    .line 248
    const/16 v20, 0x1

    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_b
    move/from16 v20, v10

    .line 252
    .line 253
    :goto_9
    invoke-interface {v2, v7, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    if-eqz v5, :cond_c

    .line 258
    .line 259
    const/4 v5, 0x7

    .line 260
    invoke-virtual {v4, v5, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    goto :goto_a

    .line 265
    :cond_c
    move v5, v10

    .line 266
    :goto_a
    const-string v10, "endColor"

    .line 267
    .line 268
    invoke-interface {v2, v7, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    if-eqz v10, :cond_d

    .line 273
    .line 274
    move/from16 v21, v12

    .line 275
    .line 276
    const/4 v10, 0x0

    .line 277
    const/4 v12, 0x1

    .line 278
    invoke-virtual {v4, v12, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 279
    .line 280
    .line 281
    move-result v23

    .line 282
    move/from16 v12, v23

    .line 283
    .line 284
    goto :goto_b

    .line 285
    :cond_d
    move/from16 v21, v12

    .line 286
    .line 287
    const/4 v10, 0x0

    .line 288
    move v12, v10

    .line 289
    :goto_b
    const-string v10, "tileMode"

    .line 290
    .line 291
    invoke-interface {v2, v7, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    if-eqz v10, :cond_e

    .line 296
    .line 297
    const/4 v10, 0x6

    .line 298
    move/from16 v22, v13

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    invoke-virtual {v4, v10, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    goto :goto_c

    .line 306
    :cond_e
    move/from16 v22, v13

    .line 307
    .line 308
    const/4 v10, 0x0

    .line 309
    :goto_c
    const-string v13, "gradientRadius"

    .line 310
    .line 311
    invoke-interface {v2, v7, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    if-eqz v7, :cond_f

    .line 316
    .line 317
    const/4 v7, 0x5

    .line 318
    const/4 v13, 0x0

    .line 319
    invoke-virtual {v4, v7, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    move v13, v7

    .line 324
    goto :goto_d

    .line 325
    :cond_f
    const/4 v13, 0x0

    .line 326
    :goto_d
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    const/4 v7, 0x1

    .line 334
    add-int/2addr v4, v7

    .line 335
    new-instance v7, Ljava/util/ArrayList;

    .line 336
    .line 337
    move-object/from16 v24, v2

    .line 338
    .line 339
    const/16 v2, 0x14

    .line 340
    .line 341
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    .line 343
    .line 344
    move/from16 v25, v13

    .line 345
    .line 346
    new-instance v13, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 349
    .line 350
    .line 351
    :goto_e
    invoke-interface/range {v24 .. v24}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    move/from16 v26, v14

    .line 356
    .line 357
    const/4 v14, 0x1

    .line 358
    if-eq v2, v14, :cond_15

    .line 359
    .line 360
    invoke-interface/range {v24 .. v24}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    move/from16 v27, v15

    .line 365
    .line 366
    if-ge v14, v4, :cond_10

    .line 367
    .line 368
    const/4 v15, 0x3

    .line 369
    if-eq v2, v15, :cond_16

    .line 370
    .line 371
    :cond_10
    const/4 v15, 0x2

    .line 372
    if-eq v2, v15, :cond_12

    .line 373
    .line 374
    :cond_11
    :goto_f
    move/from16 v14, v26

    .line 375
    .line 376
    move/from16 v15, v27

    .line 377
    .line 378
    goto :goto_e

    .line 379
    :cond_12
    if-gt v14, v4, :cond_11

    .line 380
    .line 381
    invoke-interface/range {v24 .. v24}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const-string v14, "item"

    .line 386
    .line 387
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    if-nez v2, :cond_13

    .line 392
    .line 393
    goto :goto_f

    .line 394
    :cond_13
    sget-object v2, Ldefpackage/mt3;->f:[I

    .line 395
    .line 396
    invoke-static {v0, v1, v3, v2}, Ldefpackage/gi1;->O(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    const/4 v14, 0x0

    .line 401
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 402
    .line 403
    .line 404
    move-result v15

    .line 405
    const/4 v14, 0x1

    .line 406
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 407
    .line 408
    .line 409
    move-result v19

    .line 410
    if-eqz v15, :cond_14

    .line 411
    .line 412
    if-eqz v19, :cond_14

    .line 413
    .line 414
    const/4 v15, 0x0

    .line 415
    invoke-virtual {v2, v15, v15}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 416
    .line 417
    .line 418
    move-result v28

    .line 419
    const/4 v15, 0x0

    .line 420
    invoke-virtual {v2, v14, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 421
    .line 422
    .line 423
    move-result v29

    .line 424
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 425
    .line 426
    .line 427
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    invoke-static/range {v29 .. v29}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_f

    .line 442
    :cond_14
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 443
    .line 444
    invoke-interface/range {v24 .. v24}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    new-instance v2, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    const-string v1, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"

    .line 457
    .line 458
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v0

    .line 469
    :cond_15
    move/from16 v27, v15

    .line 470
    .line 471
    :cond_16
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-lez v0, :cond_17

    .line 476
    .line 477
    new-instance v0, Ldefpackage/gp3;

    .line 478
    .line 479
    invoke-direct {v0, v13, v7}, Ldefpackage/gp3;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 480
    .line 481
    .line 482
    goto :goto_10

    .line 483
    :cond_17
    const/4 v0, 0x0

    .line 484
    :goto_10
    if-eqz v0, :cond_18

    .line 485
    .line 486
    :goto_11
    const/4 v14, 0x1

    .line 487
    goto :goto_12

    .line 488
    :cond_18
    if-eqz v20, :cond_19

    .line 489
    .line 490
    new-instance v0, Ldefpackage/gp3;

    .line 491
    .line 492
    invoke-direct {v0, v6, v5, v12}, Ldefpackage/gp3;-><init>(III)V

    .line 493
    .line 494
    .line 495
    goto :goto_11

    .line 496
    :cond_19
    new-instance v0, Ldefpackage/gp3;

    .line 497
    .line 498
    invoke-direct {v0, v6, v12}, Ldefpackage/gp3;-><init>(II)V

    .line 499
    .line 500
    .line 501
    goto :goto_11

    .line 502
    :goto_12
    if-eq v11, v14, :cond_1d

    .line 503
    .line 504
    const/4 v15, 0x2

    .line 505
    if-eq v11, v15, :cond_1c

    .line 506
    .line 507
    new-instance v11, Landroid/graphics/LinearGradient;

    .line 508
    .line 509
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 510
    .line 511
    move-object/from16 v16, v1

    .line 512
    .line 513
    check-cast v16, [I

    .line 514
    .line 515
    iget-object v0, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 516
    .line 517
    move-object/from16 v17, v0

    .line 518
    .line 519
    check-cast v17, [F

    .line 520
    .line 521
    if-eq v10, v14, :cond_1b

    .line 522
    .line 523
    if-eq v10, v15, :cond_1a

    .line 524
    .line 525
    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 526
    .line 527
    :goto_13
    move-object/from16 v18, v0

    .line 528
    .line 529
    move/from16 v12, v21

    .line 530
    .line 531
    move/from16 v13, v22

    .line 532
    .line 533
    move/from16 v14, v26

    .line 534
    .line 535
    move/from16 v15, v27

    .line 536
    .line 537
    goto :goto_14

    .line 538
    :cond_1a
    sget-object v0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 539
    .line 540
    goto :goto_13

    .line 541
    :cond_1b
    sget-object v0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 542
    .line 543
    goto :goto_13

    .line 544
    :goto_14
    invoke-direct/range {v11 .. v18}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 545
    .line 546
    .line 547
    goto :goto_17

    .line 548
    :cond_1c
    new-instance v11, Landroid/graphics/SweepGradient;

    .line 549
    .line 550
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v1, [I

    .line 553
    .line 554
    iget-object v0, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, [F

    .line 557
    .line 558
    invoke-direct {v11, v8, v9, v1, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 559
    .line 560
    .line 561
    goto :goto_17

    .line 562
    :cond_1d
    const/16 v17, 0x0

    .line 563
    .line 564
    cmpg-float v1, v25, v17

    .line 565
    .line 566
    if-lez v1, :cond_20

    .line 567
    .line 568
    new-instance v16, Landroid/graphics/RadialGradient;

    .line 569
    .line 570
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 571
    .line 572
    move-object/from16 v20, v1

    .line 573
    .line 574
    check-cast v20, [I

    .line 575
    .line 576
    iget-object v0, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 577
    .line 578
    move-object/from16 v21, v0

    .line 579
    .line 580
    check-cast v21, [F

    .line 581
    .line 582
    const/4 v14, 0x1

    .line 583
    if-eq v10, v14, :cond_1f

    .line 584
    .line 585
    const/4 v15, 0x2

    .line 586
    if-eq v10, v15, :cond_1e

    .line 587
    .line 588
    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 589
    .line 590
    :goto_15
    move-object/from16 v22, v0

    .line 591
    .line 592
    move/from16 v17, v8

    .line 593
    .line 594
    move/from16 v18, v9

    .line 595
    .line 596
    move/from16 v19, v25

    .line 597
    .line 598
    goto :goto_16

    .line 599
    :cond_1e
    sget-object v0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 600
    .line 601
    goto :goto_15

    .line 602
    :cond_1f
    sget-object v0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 603
    .line 604
    goto :goto_15

    .line 605
    :goto_16
    invoke-direct/range {v16 .. v22}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 606
    .line 607
    .line 608
    move-object/from16 v11, v16

    .line 609
    .line 610
    :goto_17
    new-instance v0, Ldefpackage/ue1;

    .line 611
    .line 612
    const/4 v1, 0x0

    .line 613
    const/4 v13, 0x0

    .line 614
    invoke-direct {v0, v11, v1, v13}, Ldefpackage/ue1;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    .line 615
    .line 616
    .line 617
    return-object v0

    .line 618
    :cond_20
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 619
    .line 620
    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    .line 621
    .line 622
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    throw v0

    .line 626
    :cond_21
    move-object/from16 v24, v2

    .line 627
    .line 628
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 629
    .line 630
    invoke-interface/range {v24 .. v24}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    new-instance v2, Ljava/lang/StringBuilder;

    .line 635
    .line 636
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    const-string v1, ": invalid gradient color tag "

    .line 643
    .line 644
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v0

    .line 658
    :cond_22
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 659
    .line 660
    const-string v1, "No start tag found"

    .line 661
    .line 662
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    throw v0
.end method


# virtual methods
.method public A([B[B)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaDrm;->restoreKeys([B[B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public B([B)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaDrm;->closeSession([B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public C(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/si1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Ldefpackage/yj4;

    .line 12
    .line 13
    invoke-direct {v1, v0, p0, p1}, Ldefpackage/yj4;-><init>(Ldefpackage/si1;Ldefpackage/ue1;Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v1}, Ldefpackage/yj4;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ldefpackage/yj4;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public D(Ldefpackage/zg5;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    new-instance v1, Ldefpackage/te1;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Ldefpackage/te1;-><init>(Ldefpackage/ue1;Ldefpackage/zg5;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/media/MediaDrm;->setOnEventListener(Landroid/media/MediaDrm$OnEventListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public E(IIIJ)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x32

    .line 4
    .line 5
    shr-long v2, p4, v1

    .line 6
    .line 7
    long-to-int v2, v2

    .line 8
    const/16 v3, 0x3ff

    .line 9
    .line 10
    and-int/2addr v2, v3

    .line 11
    if-lez v2, :cond_4

    .line 12
    .line 13
    sget v2, Ldefpackage/xv3;->b:I

    .line 14
    .line 15
    const-wide v4, -0x3fffffe000001L

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long v6, p4, v4

    .line 21
    .line 22
    const v2, 0x1ffffff

    .line 23
    .line 24
    .line 25
    and-int v8, p1, v2

    .line 26
    .line 27
    int-to-long v8, v8

    .line 28
    const/16 v10, 0x19

    .line 29
    .line 30
    shl-long/2addr v8, v10

    .line 31
    or-long/2addr v6, v8

    .line 32
    iget-object v8, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v8, [J

    .line 35
    .line 36
    iget-object v9, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v9, [J

    .line 39
    .line 40
    iget v0, v0, Ldefpackage/ue1;->o:I

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    aput-wide v6, v9, v11

    .line 44
    .line 45
    const/4 v6, 0x1

    .line 46
    :goto_0
    if-lez v6, :cond_4

    .line 47
    .line 48
    add-int/lit8 v6, v6, -0x1

    .line 49
    .line 50
    aget-wide v11, v9, v6

    .line 51
    .line 52
    long-to-int v7, v11

    .line 53
    and-int/2addr v7, v2

    .line 54
    shr-long v13, v11, v10

    .line 55
    .line 56
    long-to-int v13, v13

    .line 57
    and-int/2addr v13, v2

    .line 58
    shr-long/2addr v11, v1

    .line 59
    long-to-int v11, v11

    .line 60
    and-int/2addr v11, v3

    .line 61
    if-ne v11, v3, :cond_0

    .line 62
    .line 63
    move v11, v0

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    mul-int/lit8 v11, v11, 0x3

    .line 66
    .line 67
    add-int/2addr v11, v13

    .line 68
    :goto_1
    if-ltz v13, :cond_4

    .line 69
    .line 70
    :goto_2
    add-int/lit8 v12, v0, -0x2

    .line 71
    .line 72
    if-ge v13, v12, :cond_3

    .line 73
    .line 74
    if-gt v13, v11, :cond_3

    .line 75
    .line 76
    add-int/lit8 v12, v13, 0x2

    .line 77
    .line 78
    aget-wide v14, v8, v12

    .line 79
    .line 80
    move/from16 v16, v1

    .line 81
    .line 82
    move/from16 p4, v2

    .line 83
    .line 84
    shr-long v1, v14, v10

    .line 85
    .line 86
    long-to-int v1, v1

    .line 87
    and-int v1, v1, p4

    .line 88
    .line 89
    if-ne v1, v7, :cond_1

    .line 90
    .line 91
    aget-wide v1, v8, v13

    .line 92
    .line 93
    add-int/lit8 v17, v13, 0x1

    .line 94
    .line 95
    move-wide/from16 v18, v4

    .line 96
    .line 97
    aget-wide v4, v8, v17

    .line 98
    .line 99
    const/16 v20, 0x20

    .line 100
    .line 101
    move/from16 p1, v10

    .line 102
    .line 103
    move/from16 p0, v11

    .line 104
    .line 105
    shr-long v10, v1, v20

    .line 106
    .line 107
    long-to-int v10, v10

    .line 108
    add-int v10, v10, p2

    .line 109
    .line 110
    long-to-int v1, v1

    .line 111
    add-int v1, v1, p3

    .line 112
    .line 113
    int-to-long v10, v10

    .line 114
    shl-long v10, v10, v20

    .line 115
    .line 116
    int-to-long v1, v1

    .line 117
    const-wide v21, 0xffffffffL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    and-long v1, v1, v21

    .line 123
    .line 124
    or-long/2addr v1, v10

    .line 125
    aput-wide v1, v8, v13

    .line 126
    .line 127
    shr-long v1, v4, v20

    .line 128
    .line 129
    long-to-int v1, v1

    .line 130
    add-int v1, v1, p2

    .line 131
    .line 132
    long-to-int v2, v4

    .line 133
    add-int v2, v2, p3

    .line 134
    .line 135
    int-to-long v4, v1

    .line 136
    shl-long v4, v4, v20

    .line 137
    .line 138
    int-to-long v1, v2

    .line 139
    and-long v1, v1, v21

    .line 140
    .line 141
    or-long/2addr v1, v4

    .line 142
    aput-wide v1, v8, v17

    .line 143
    .line 144
    const/16 v1, 0x3f

    .line 145
    .line 146
    shr-long v1, v14, v1

    .line 147
    .line 148
    const-wide/16 v4, 0x1

    .line 149
    .line 150
    and-long/2addr v1, v4

    .line 151
    const/16 v4, 0x3c

    .line 152
    .line 153
    shl-long/2addr v1, v4

    .line 154
    or-long/2addr v1, v14

    .line 155
    aput-wide v1, v8, v12

    .line 156
    .line 157
    shr-long v1, v14, v16

    .line 158
    .line 159
    long-to-int v1, v1

    .line 160
    and-int/2addr v1, v3

    .line 161
    if-lez v1, :cond_2

    .line 162
    .line 163
    add-int/lit8 v1, v6, 0x1

    .line 164
    .line 165
    add-int/lit8 v2, v13, 0x3

    .line 166
    .line 167
    sget v4, Ldefpackage/xv3;->b:I

    .line 168
    .line 169
    and-long v4, v14, v18

    .line 170
    .line 171
    and-int v2, v2, p4

    .line 172
    .line 173
    int-to-long v10, v2

    .line 174
    shl-long v10, v10, p1

    .line 175
    .line 176
    or-long/2addr v4, v10

    .line 177
    aput-wide v4, v9, v6

    .line 178
    .line 179
    move v6, v1

    .line 180
    goto :goto_3

    .line 181
    :cond_1
    move-wide/from16 v18, v4

    .line 182
    .line 183
    move/from16 p1, v10

    .line 184
    .line 185
    move/from16 p0, v11

    .line 186
    .line 187
    :cond_2
    :goto_3
    add-int/lit8 v13, v13, 0x3

    .line 188
    .line 189
    move/from16 v11, p0

    .line 190
    .line 191
    move/from16 v10, p1

    .line 192
    .line 193
    move/from16 v2, p4

    .line 194
    .line 195
    move/from16 v1, v16

    .line 196
    .line 197
    move-wide/from16 v4, v18

    .line 198
    .line 199
    goto/16 :goto_2

    .line 200
    .line 201
    :cond_3
    move/from16 v16, v1

    .line 202
    .line 203
    move/from16 p4, v2

    .line 204
    .line 205
    move-wide/from16 v18, v4

    .line 206
    .line 207
    move/from16 p1, v10

    .line 208
    .line 209
    move/from16 v10, p1

    .line 210
    .line 211
    move/from16 v2, p4

    .line 212
    .line 213
    move/from16 v1, v16

    .line 214
    .line 215
    move-wide/from16 v4, v18

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_4
    return-void
.end method

.method public H([B[B)[B
    .locals 9

    .line 1
    sget-object v0, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/UUID;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x1b

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/String;

    .line 26
    .line 27
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-direct {v1, p2, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "{\"keys\":["

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "keys"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v2, 0x0

    .line 49
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ge v2, v3, :cond_2

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    const-string v3, ","

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const-string v4, "{\"k\":\""

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v4, "k"

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const/16 v5, 0x2b

    .line 81
    .line 82
    const/16 v6, 0x2d

    .line 83
    .line 84
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const/16 v7, 0x2f

    .line 89
    .line 90
    const/16 v8, 0x5f

    .line 91
    .line 92
    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v4, "\",\"kid\":\""

    .line 100
    .line 101
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v4, "kid"

    .line 105
    .line 106
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v4, "\",\"kty\":\""

    .line 122
    .line 123
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v4, "kty"

    .line 127
    .line 128
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v3, "\"}"

    .line 136
    .line 137
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_2
    const-string v0, "]}"

    .line 144
    .line 145
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 155
    .line 156
    .line 157
    move-result-object p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    goto :goto_3

    .line 159
    :goto_2
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 160
    .line 161
    new-instance v1, Ljava/lang/String;

    .line 162
    .line 163
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 164
    .line 165
    invoke-direct {v1, p2, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 166
    .line 167
    .line 168
    const-string v2, "Failed to adjust response data: "

    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const-string v2, "ClearKeyUtil"

    .line 175
    .line 176
    invoke-static {v2, v1, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    :cond_3
    :goto_3
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Landroid/media/MediaDrm;

    .line 182
    .line 183
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaDrm;->provideKeyResponse([B[B)[B

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0
.end method

.method public N([B)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaDrm;->provideProvisionResponse([B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public O([BLjava/util/List;ILjava/util/HashMap;)Ldefpackage/k31;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/UUID;

    .line 8
    .line 9
    const-string v4, "<LA_URL>https://x</LA_URL>"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v1, :cond_12

    .line 13
    .line 14
    sget-object v6, Ldefpackage/ax;->d:Ljava/util/UUID;

    .line 15
    .line 16
    invoke-virtual {v6, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/4 v7, -0x1

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x1

    .line 23
    if-nez v6, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ldefpackage/nw0;

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v10, 0x1c

    .line 36
    .line 37
    if-lt v6, v10, :cond_3

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-le v6, v9, :cond_3

    .line 44
    .line 45
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Ldefpackage/nw0;

    .line 50
    .line 51
    move v10, v8

    .line 52
    move v11, v10

    .line 53
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-ge v10, v12, :cond_1

    .line 58
    .line 59
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    check-cast v12, Ldefpackage/nw0;

    .line 64
    .line 65
    iget-object v13, v12, Ldefpackage/nw0;->r:[B

    .line 66
    .line 67
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v14, v12, Ldefpackage/nw0;->q:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v15, v6, Ldefpackage/nw0;->q:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v14, v15}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    if-eqz v14, :cond_3

    .line 79
    .line 80
    iget-object v12, v12, Ldefpackage/nw0;->p:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v14, v6, Ldefpackage/nw0;->p:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v12, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-eqz v12, :cond_3

    .line 89
    .line 90
    invoke-static {v13}, Ldefpackage/te5;->G([B)Ldefpackage/gc;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    if-eqz v12, :cond_3

    .line 95
    .line 96
    array-length v12, v13

    .line 97
    add-int/2addr v11, v12

    .line 98
    add-int/lit8 v10, v10, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    new-array v10, v11, [B

    .line 102
    .line 103
    move v11, v8

    .line 104
    move v12, v11

    .line 105
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-ge v11, v13, :cond_2

    .line 110
    .line 111
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    check-cast v13, Ldefpackage/nw0;

    .line 116
    .line 117
    iget-object v13, v13, Ldefpackage/nw0;->r:[B

    .line 118
    .line 119
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    array-length v14, v13

    .line 123
    invoke-static {v13, v8, v10, v12, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 124
    .line 125
    .line 126
    add-int/2addr v12, v14

    .line 127
    add-int/lit8 v11, v11, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    new-instance v1, Ldefpackage/nw0;

    .line 131
    .line 132
    iget-object v11, v6, Ldefpackage/nw0;->o:Ljava/util/UUID;

    .line 133
    .line 134
    iget-object v12, v6, Ldefpackage/nw0;->p:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v6, v6, Ldefpackage/nw0;->q:Ljava/lang/String;

    .line 137
    .line 138
    invoke-direct {v1, v11, v12, v6, v10}, Ldefpackage/nw0;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_3
    move v6, v8

    .line 143
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-ge v6, v10, :cond_6

    .line 148
    .line 149
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    check-cast v10, Ldefpackage/nw0;

    .line 154
    .line 155
    iget-object v11, v10, Ldefpackage/nw0;->r:[B

    .line 156
    .line 157
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v11}, Ldefpackage/te5;->G([B)Ldefpackage/gc;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    if-nez v11, :cond_4

    .line 165
    .line 166
    move v11, v7

    .line 167
    goto :goto_3

    .line 168
    :cond_4
    iget v11, v11, Ldefpackage/gc;->a:I

    .line 169
    .line 170
    :goto_3
    if-ne v11, v9, :cond_5

    .line 171
    .line 172
    move-object v1, v10

    .line 173
    goto :goto_4

    .line 174
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, Ldefpackage/nw0;

    .line 182
    .line 183
    :goto_4
    iget-object v6, v1, Ldefpackage/nw0;->r:[B

    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    sget-object v10, Ldefpackage/ax;->e:Ljava/util/UUID;

    .line 189
    .line 190
    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-eqz v11, :cond_c

    .line 195
    .line 196
    invoke-static {v2, v6}, Ldefpackage/te5;->H(Ljava/util/UUID;[B)[B

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    if-nez v11, :cond_7

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_7
    move-object v6, v11

    .line 204
    :goto_5
    new-instance v11, Ldefpackage/be3;

    .line 205
    .line 206
    invoke-direct {v11, v6}, Ldefpackage/be3;-><init>([B)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11}, Ldefpackage/be3;->o()I

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    invoke-virtual {v11}, Ldefpackage/be3;->q()S

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    invoke-virtual {v11}, Ldefpackage/be3;->q()S

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    const-string v15, "FrameworkMediaDrm"

    .line 222
    .line 223
    if-ne v13, v9, :cond_b

    .line 224
    .line 225
    if-eq v14, v9, :cond_8

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_8
    invoke-virtual {v11}, Ldefpackage/be3;->q()S

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 233
    .line 234
    invoke-virtual {v11, v9, v3}, Ldefpackage/be3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    const-string v11, "<LA_URL>"

    .line 239
    .line 240
    invoke-virtual {v9, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    if-eqz v11, :cond_9

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_9
    const-string v6, "</DATA>"

    .line 248
    .line 249
    invoke-virtual {v9, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-ne v6, v7, :cond_a

    .line 254
    .line 255
    const-string v7, "Could not find the </DATA> tag. Skipping LA_URL workaround."

    .line 256
    .line 257
    invoke-static {v15, v7}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    new-instance v7, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    add-int/lit8 v12, v12, 0x34

    .line 287
    .line 288
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 293
    .line 294
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, v12}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 298
    .line 299
    .line 300
    int-to-short v8, v13

    .line 301
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 302
    .line 303
    .line 304
    int-to-short v8, v14

    .line 305
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    mul-int/lit8 v8, v8, 0x2

    .line 313
    .line 314
    int-to-short v8, v8

    .line 315
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v6, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-virtual {v7, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    goto :goto_7

    .line 330
    :cond_b
    :goto_6
    const-string v3, "Unexpected record count or type. Skipping LA_URL workaround."

    .line 331
    .line 332
    invoke-static {v15, v3}, Ldefpackage/l93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :goto_7
    invoke-static {v10, v5, v6}, Ldefpackage/te5;->d(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    :cond_c
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 340
    .line 341
    const/16 v5, 0x1b

    .line 342
    .line 343
    if-ge v3, v5, :cond_d

    .line 344
    .line 345
    sget-object v5, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 346
    .line 347
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_d

    .line 352
    .line 353
    invoke-static {v6}, Ldefpackage/te5;->G([B)Ldefpackage/gc;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    if-eqz v5, :cond_d

    .line 358
    .line 359
    sget-object v6, Ldefpackage/ax;->b:Ljava/util/UUID;

    .line 360
    .line 361
    iget-object v7, v5, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v7, [Ljava/util/UUID;

    .line 364
    .line 365
    iget-object v5, v5, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v5, [B

    .line 368
    .line 369
    invoke-static {v6, v7, v5}, Ldefpackage/te5;->d(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    :cond_d
    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_f

    .line 378
    .line 379
    const-string v5, "Amazon"

    .line 380
    .line 381
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-eqz v5, :cond_f

    .line 388
    .line 389
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 390
    .line 391
    const-string v7, "AFTB"

    .line 392
    .line 393
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    if-nez v7, :cond_e

    .line 398
    .line 399
    const-string v7, "AFTS"

    .line 400
    .line 401
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-nez v7, :cond_e

    .line 406
    .line 407
    const-string v7, "AFTM"

    .line 408
    .line 409
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    if-nez v7, :cond_e

    .line 414
    .line 415
    const-string v7, "AFTT"

    .line 416
    .line 417
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    if-eqz v5, :cond_f

    .line 422
    .line 423
    :cond_e
    invoke-static {v2, v6}, Ldefpackage/te5;->H(Ljava/util/UUID;[B)[B

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    if-eqz v5, :cond_f

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_f
    move-object v5, v6

    .line 431
    :goto_8
    iget-object v6, v1, Ldefpackage/nw0;->q:Ljava/lang/String;

    .line 432
    .line 433
    const/16 v7, 0x1a

    .line 434
    .line 435
    if-ge v3, v7, :cond_11

    .line 436
    .line 437
    sget-object v3, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 438
    .line 439
    invoke-virtual {v3, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    if-eqz v3, :cond_11

    .line 444
    .line 445
    const-string v3, "video/mp4"

    .line 446
    .line 447
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-nez v3, :cond_10

    .line 452
    .line 453
    const-string v3, "audio/mp4"

    .line 454
    .line 455
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_11

    .line 460
    .line 461
    :cond_10
    const-string v3, "cenc"

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_11
    move-object v3, v6

    .line 465
    :goto_9
    move-object v9, v3

    .line 466
    move-object v8, v5

    .line 467
    move-object v5, v1

    .line 468
    goto :goto_a

    .line 469
    :cond_12
    move-object v8, v5

    .line 470
    move-object v9, v8

    .line 471
    :goto_a
    iget-object v1, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 472
    .line 473
    move-object v6, v1

    .line 474
    check-cast v6, Landroid/media/MediaDrm;

    .line 475
    .line 476
    move-object/from16 v7, p1

    .line 477
    .line 478
    move/from16 v10, p3

    .line 479
    .line 480
    move-object/from16 v11, p4

    .line 481
    .line 482
    invoke-virtual/range {v6 .. v11}, Landroid/media/MediaDrm;->getKeyRequest([B[BLjava/lang/String;ILjava/util/HashMap;)Landroid/media/MediaDrm$KeyRequest;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v1}, Landroid/media/MediaDrm$KeyRequest;->getData()[B

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    sget-object v6, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 491
    .line 492
    invoke-virtual {v6, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-eqz v2, :cond_14

    .line 497
    .line 498
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 499
    .line 500
    const/16 v6, 0x1b

    .line 501
    .line 502
    if-lt v2, v6, :cond_13

    .line 503
    .line 504
    goto :goto_b

    .line 505
    :cond_13
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 506
    .line 507
    new-instance v2, Ljava/lang/String;

    .line 508
    .line 509
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 510
    .line 511
    invoke-direct {v2, v3, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 512
    .line 513
    .line 514
    const/16 v3, 0x2b

    .line 515
    .line 516
    const/16 v7, 0x2d

    .line 517
    .line 518
    invoke-virtual {v2, v3, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/16 v3, 0x2f

    .line 523
    .line 524
    const/16 v7, 0x5f

    .line 525
    .line 526
    invoke-virtual {v2, v3, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-virtual {v2, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    :cond_14
    :goto_b
    invoke-virtual {v1}, Landroid/media/MediaDrm$KeyRequest;->getDefaultUrl()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    const-string v6, ""

    .line 543
    .line 544
    if-eqz v4, :cond_16

    .line 545
    .line 546
    :cond_15
    :goto_c
    move-object v2, v6

    .line 547
    goto :goto_d

    .line 548
    :cond_16
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 549
    .line 550
    const/16 v7, 0x21

    .line 551
    .line 552
    if-lt v4, v7, :cond_17

    .line 553
    .line 554
    const-string v4, "https://default.url"

    .line 555
    .line 556
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_17

    .line 561
    .line 562
    iget-object v0, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, Landroid/media/MediaDrm;

    .line 565
    .line 566
    const-string v4, "version"

    .line 567
    .line 568
    invoke-virtual {v0, v4}, Landroid/media/MediaDrm;->getPropertyString(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    const-string v4, "1.2"

    .line 573
    .line 574
    invoke-static {v0, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    if-nez v4, :cond_15

    .line 579
    .line 580
    const-string v4, "aidl-1"

    .line 581
    .line 582
    invoke-static {v0, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-eqz v0, :cond_17

    .line 587
    .line 588
    goto :goto_c

    .line 589
    :cond_17
    :goto_d
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_18

    .line 594
    .line 595
    if-eqz v5, :cond_18

    .line 596
    .line 597
    iget-object v0, v5, Ldefpackage/nw0;->p:Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    if-nez v4, :cond_18

    .line 604
    .line 605
    move-object v2, v0

    .line 606
    :cond_18
    invoke-virtual {v1}, Landroid/media/MediaDrm$KeyRequest;->getRequestType()I

    .line 607
    .line 608
    .line 609
    new-instance v0, Ldefpackage/k31;

    .line 610
    .line 611
    invoke-direct {v0, v2, v3}, Ldefpackage/k31;-><init>(Ljava/lang/String;[B)V

    .line 612
    .line 613
    .line 614
    return-object v0
.end method

.method public P()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public Q([BLdefpackage/ik3;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/media/MediaDrm;

    .line 10
    .line 11
    invoke-virtual {p2}, Ldefpackage/ik3;->a()Landroid/media/metrics/LogSessionId;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {}, Ldefpackage/go2;->d()Landroid/media/metrics/LogSessionId;

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Ldefpackage/go2;->w(Landroid/media/metrics/LogSessionId;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-static {p0, p1}, Ldefpackage/hd0;->e(Landroid/media/MediaDrm;[B)Landroid/media/MediaDrm$PlaybackComponent;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Ldefpackage/hd0;->f(Ljava/lang/Object;)Landroid/media/MediaDrm$PlaybackComponent;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0, p2}, Ldefpackage/hd0;->q(Landroid/media/MediaDrm$PlaybackComponent;Landroid/media/metrics/LogSessionId;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    const-string p0, "FrameworkMediaDrm"

    .line 40
    .line 41
    const-string p1, "setLogSessionId failed."

    .line 42
    .line 43
    invoke-static {p0, p1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public U(Ljava/lang/String;[B)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/UUID;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-lt v1, v2, :cond_2

    .line 15
    .line 16
    sget-object v2, Ldefpackage/ax;->d:Ljava/util/UUID;

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const-string v2, "version"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/media/MediaDrm;->getPropertyString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v4, "v5."

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    const-string v4, "14."

    .line 39
    .line 40
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    const-string v4, "15."

    .line 47
    .line 48
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_0

    .line 53
    .line 54
    const-string v4, "16.0"

    .line 55
    .line 56
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_0

    .line 61
    .line 62
    move v2, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v2, 0x0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sget-object v2, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 67
    .line 68
    invoke-virtual {p0, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    :goto_0
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-static {v0, p2}, Ldefpackage/sr0;->a(Landroid/media/MediaDrm;[B)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {v0, p1, p0}, Ldefpackage/hd0;->w(Landroid/media/MediaDrm;Ljava/lang/String;I)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :cond_2
    const/4 v0, 0x0

    .line 84
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    .line 85
    .line 86
    const/16 v4, 0x1b

    .line 87
    .line 88
    if-ge v1, v4, :cond_3

    .line 89
    .line 90
    sget-object v1, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 91
    .line 92
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    sget-object v1, Ldefpackage/ax;->b:Ljava/util/UUID;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object v1, p0

    .line 102
    :goto_1
    invoke-direct {v2, v1, p2}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 103
    .line 104
    .line 105
    :try_start_1
    invoke-virtual {v2, p1}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p0
    :try_end_1
    .catch Landroid/media/MediaCryptoException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V

    .line 110
    .line 111
    .line 112
    return p0

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    move-object v0, v2

    .line 115
    goto :goto_3

    .line 116
    :catch_0
    move-object v0, v2

    .line 117
    goto :goto_2

    .line 118
    :catchall_1
    move-exception p0

    .line 119
    goto :goto_3

    .line 120
    :catch_1
    :goto_2
    :try_start_2
    sget-object p1, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    xor-int/2addr p0, v3

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 130
    .line 131
    .line 132
    :cond_4
    return p0

    .line 133
    :goto_3
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 136
    .line 137
    .line 138
    :cond_5
    throw p0
.end method

.method public declared-synchronized a()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldefpackage/ue1;->o:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Ldefpackage/ue1;->o:I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/media/MediaDrm;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaDrm;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Ldefpackage/aw0;->a(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/la0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, p0, v0}, Ldefpackage/fg;->e(Landroid/graphics/drawable/Drawable;Ldefpackage/la0;[I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public c(Ldefpackage/l51;J)Ldefpackage/os;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ldefpackage/l51;->getPosition()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    invoke-interface/range {p1 .. p1}, Ldefpackage/l51;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sub-long/2addr v1, v4

    .line 12
    const-wide/32 v6, 0x1b8a0

    .line 13
    .line 14
    .line 15
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    long-to-int v1, v1

    .line 20
    iget-object v2, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ldefpackage/be3;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ldefpackage/be3;->K(I)V

    .line 25
    .line 26
    .line 27
    iget-object v3, v2, Ldefpackage/be3;->a:[B

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    move-object/from16 v7, p1

    .line 31
    .line 32
    invoke-interface {v7, v3, v6, v1}, Ldefpackage/l51;->n([BII)V

    .line 33
    .line 34
    .line 35
    iget v1, v2, Ldefpackage/be3;->c:I

    .line 36
    .line 37
    const-wide/16 v6, -0x1

    .line 38
    .line 39
    move-wide v10, v6

    .line 40
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/16 v12, 0xbc

    .line 50
    .line 51
    if-lt v3, v12, :cond_7

    .line 52
    .line 53
    iget-object v3, v2, Ldefpackage/be3;->a:[B

    .line 54
    .line 55
    iget v12, v2, Ldefpackage/be3;->b:I

    .line 56
    .line 57
    :goto_1
    if-ge v12, v1, :cond_0

    .line 58
    .line 59
    aget-byte v13, v3, v12

    .line 60
    .line 61
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const/16 v8, 0x47

    .line 67
    .line 68
    if-eq v13, v8, :cond_1

    .line 69
    .line 70
    add-int/lit8 v12, v12, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :cond_1
    add-int/lit16 v3, v12, 0xbc

    .line 79
    .line 80
    if-le v3, v1, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    iget v6, v0, Ldefpackage/ue1;->o:I

    .line 84
    .line 85
    invoke-static {v2, v12, v6}, Ldefpackage/au0;->P(Ldefpackage/be3;II)J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    cmp-long v8, v6, v16

    .line 90
    .line 91
    if-eqz v8, :cond_6

    .line 92
    .line 93
    iget-object v8, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v8, Ldefpackage/iu4;

    .line 96
    .line 97
    invoke-virtual {v8, v6, v7}, Ldefpackage/iu4;->b(J)J

    .line 98
    .line 99
    .line 100
    move-result-wide v6

    .line 101
    cmp-long v8, v6, p2

    .line 102
    .line 103
    if-lez v8, :cond_4

    .line 104
    .line 105
    cmp-long v0, v14, v16

    .line 106
    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    new-instance v0, Ldefpackage/os;

    .line 110
    .line 111
    const/4 v1, -0x1

    .line 112
    move-wide v2, v6

    .line 113
    invoke-direct/range {v0 .. v5}, Ldefpackage/os;-><init>(IJJ)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_3
    add-long v16, v4, v10

    .line 118
    .line 119
    new-instance v12, Ldefpackage/os;

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-direct/range {v12 .. v17}, Ldefpackage/os;-><init>(IJJ)V

    .line 128
    .line 129
    .line 130
    return-object v12

    .line 131
    :cond_4
    move-wide v14, v6

    .line 132
    const-wide/32 v6, 0x186a0

    .line 133
    .line 134
    .line 135
    add-long/2addr v6, v14

    .line 136
    cmp-long v6, v6, p2

    .line 137
    .line 138
    if-lez v6, :cond_5

    .line 139
    .line 140
    int-to-long v0, v12

    .line 141
    add-long v10, v4, v0

    .line 142
    .line 143
    new-instance v6, Ldefpackage/os;

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    invoke-direct/range {v6 .. v11}, Ldefpackage/os;-><init>(IJJ)V

    .line 152
    .line 153
    .line 154
    return-object v6

    .line 155
    :cond_5
    int-to-long v6, v12

    .line 156
    move-wide v10, v6

    .line 157
    :cond_6
    invoke-virtual {v2, v3}, Ldefpackage/be3;->N(I)V

    .line 158
    .line 159
    .line 160
    int-to-long v6, v3

    .line 161
    goto :goto_0

    .line 162
    :cond_7
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :goto_2
    cmp-long v0, v14, v16

    .line 168
    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    add-long v16, v4, v6

    .line 172
    .line 173
    new-instance v12, Ldefpackage/os;

    .line 174
    .line 175
    const/4 v13, -0x2

    .line 176
    invoke-direct/range {v12 .. v17}, Ldefpackage/os;-><init>(IJJ)V

    .line 177
    .line 178
    .line 179
    return-object v12

    .line 180
    :cond_8
    sget-object v0, Ldefpackage/os;->e:Ldefpackage/os;

    .line 181
    .line 182
    return-object v0
.end method

.method public d(Z)Ldefpackage/ly3;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/ax1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ax1;->a()Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    throw p0

    .line 15
    :cond_1
    :goto_0
    iget v0, p0, Ldefpackage/ue1;->o:I

    .line 16
    .line 17
    iget-object v1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, [Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v0, v1, p0}, Ldefpackage/ly3;->g(I[Ljava/lang/Object;Ldefpackage/ue1;)Ldefpackage/ly3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ldefpackage/ax1;

    .line 30
    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-virtual {p0}, Ldefpackage/ax1;->a()Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0

    .line 39
    :cond_3
    :goto_1
    return-object v0
.end method

.method public e([B)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaDrm;->queryKeyStatus([B)Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public f()Ldefpackage/bx1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/ue1;->d(Z)Ldefpackage/ly3;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Ljava/util/List;

    .line 3
    .line 4
    iget-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Ldefpackage/ls2;

    .line 7
    .line 8
    iget-object p1, p1, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 9
    .line 10
    iget-object v6, p1, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, Ldefpackage/fr2;

    .line 16
    .line 17
    iget v2, p0, Ldefpackage/ue1;->o:I

    .line 18
    .line 19
    new-instance v0, Ldefpackage/ct0;

    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    move-object v1, p0

    .line 23
    invoke-direct/range {v0 .. v5}, Ldefpackage/ct0;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Ldefpackage/ur2;

    .line 27
    .line 28
    invoke-direct {p0, p1, v4, v0}, Ldefpackage/ur2;-><init>(Ldefpackage/tn2;Ldefpackage/fr2;Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v6, p0}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public i(Ldefpackage/wc0;)V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ldefpackage/rt2;

    .line 20
    .line 21
    iget-object v1, v0, Ldefpackage/rt2;->b:Ldefpackage/st2;

    .line 22
    .line 23
    iget-object v0, v0, Ldefpackage/rt2;->a:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v2, Ldefpackage/ur2;

    .line 26
    .line 27
    const/4 v3, 0x5

    .line 28
    invoke-direct {v2, v3, p1, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public j(I)Ldefpackage/f12;
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/ue1;->o:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Ldefpackage/ue1;->o:I

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Index "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, ", size "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Ldefpackage/fz1;->d(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ldefpackage/f12;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget v1, v0, Ldefpackage/f12;->a:I

    .line 42
    .line 43
    iget v2, v0, Ldefpackage/f12;->b:I

    .line 44
    .line 45
    add-int/2addr v2, v1

    .line 46
    if-ge p1, v2, :cond_1

    .line 47
    .line 48
    if-gt v1, p1, :cond_1

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ldefpackage/f13;

    .line 54
    .line 55
    invoke-static {p1, v0}, Ldefpackage/su3;->e(ILdefpackage/f13;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object v0, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 60
    .line 61
    aget-object p1, v0, p1

    .line 62
    .line 63
    check-cast p1, Ldefpackage/f12;

    .line 64
    .line 65
    iput-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 66
    .line 67
    return-object p1
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/be3;

    .line 4
    .line 5
    sget-object v0, Ldefpackage/f35;->b:[B

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v1, v0

    .line 11
    invoke-virtual {p0, v1, v0}, Ldefpackage/be3;->L(I[B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseArray;

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput v1, p0, Ldefpackage/ue1;->o:I

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 14
    .line 15
    if-lez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge p1, v1, :cond_1

    .line 22
    .line 23
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    iput v1, p0, Ldefpackage/ue1;->o:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    if-ge v1, v2, :cond_2

    .line 39
    .line 40
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-lt p1, v1, :cond_2

    .line 49
    .line 50
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    iput v1, p0, Ldefpackage/ue1;->o:I

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget p0, p0, Ldefpackage/ue1;->o:I

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public m(IIIIIIIZZZ)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    move/from16 v2, p7

    .line 6
    .line 7
    const v3, 0x1ffffff

    .line 8
    .line 9
    .line 10
    and-int v4, p1, v3

    .line 11
    .line 12
    iget-object v5, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v5, [J

    .line 15
    .line 16
    iget v6, v0, Ldefpackage/ue1;->o:I

    .line 17
    .line 18
    add-int/lit8 v7, v6, 0x3

    .line 19
    .line 20
    iput v7, v0, Ldefpackage/ue1;->o:I

    .line 21
    .line 22
    array-length v8, v5

    .line 23
    if-gt v8, v7, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v8, v8, 0x2

    .line 26
    .line 27
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iput-object v5, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v5, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, [J

    .line 40
    .line 41
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iput-object v5, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 46
    .line 47
    :cond_0
    iget-object v0, v0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, [J

    .line 50
    .line 51
    move/from16 v5, p2

    .line 52
    .line 53
    int-to-long v7, v5

    .line 54
    const/16 v5, 0x20

    .line 55
    .line 56
    shl-long/2addr v7, v5

    .line 57
    move/from16 v9, p3

    .line 58
    .line 59
    int-to-long v9, v9

    .line 60
    const-wide v11, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr v9, v11

    .line 66
    or-long/2addr v7, v9

    .line 67
    aput-wide v7, v0, v6

    .line 68
    .line 69
    add-int/lit8 v7, v6, 0x1

    .line 70
    .line 71
    move/from16 v8, p4

    .line 72
    .line 73
    int-to-long v8, v8

    .line 74
    shl-long/2addr v8, v5

    .line 75
    move/from16 v5, p5

    .line 76
    .line 77
    int-to-long v13, v5

    .line 78
    and-long v10, v13, v11

    .line 79
    .line 80
    or-long/2addr v8, v10

    .line 81
    aput-wide v8, v0, v7

    .line 82
    .line 83
    add-int/lit8 v5, v6, 0x2

    .line 84
    .line 85
    move/from16 v7, p10

    .line 86
    .line 87
    int-to-long v7, v7

    .line 88
    const/16 v9, 0x3f

    .line 89
    .line 90
    shl-long/2addr v7, v9

    .line 91
    move/from16 v9, p9

    .line 92
    .line 93
    int-to-long v9, v9

    .line 94
    const/16 v11, 0x3e

    .line 95
    .line 96
    shl-long/2addr v9, v11

    .line 97
    or-long/2addr v7, v9

    .line 98
    move/from16 v9, p8

    .line 99
    .line 100
    int-to-long v9, v9

    .line 101
    const/16 v11, 0x3d

    .line 102
    .line 103
    shl-long/2addr v9, v11

    .line 104
    or-long/2addr v7, v9

    .line 105
    const-wide/high16 v9, 0x1000000000000000L

    .line 106
    .line 107
    or-long/2addr v7, v9

    .line 108
    const/4 v9, 0x0

    .line 109
    const/16 v10, 0x3ff

    .line 110
    .line 111
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    int-to-long v11, v11

    .line 116
    const/16 v13, 0x32

    .line 117
    .line 118
    shl-long/2addr v11, v13

    .line 119
    or-long/2addr v7, v11

    .line 120
    and-int v11, v1, v3

    .line 121
    .line 122
    int-to-long v14, v11

    .line 123
    const/16 v12, 0x19

    .line 124
    .line 125
    shl-long/2addr v14, v12

    .line 126
    or-long/2addr v7, v14

    .line 127
    and-int v12, p1, v3

    .line 128
    .line 129
    int-to-long v14, v12

    .line 130
    or-long/2addr v7, v14

    .line 131
    aput-wide v7, v0, v5

    .line 132
    .line 133
    const/4 v5, -0x1

    .line 134
    if-ne v1, v5, :cond_1

    .line 135
    .line 136
    return v6

    .line 137
    :cond_1
    const/4 v1, -0x4

    .line 138
    const/4 v5, 0x1

    .line 139
    if-eq v2, v1, :cond_2

    .line 140
    .line 141
    move v1, v5

    .line 142
    goto :goto_0

    .line 143
    :cond_2
    move v1, v9

    .line 144
    :goto_0
    const-string v7, "Inserted child "

    .line 145
    .line 146
    if-nez v1, :cond_3

    .line 147
    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v8, " without valid parent index"

    .line 157
    .line 158
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    add-int/lit8 v1, v2, 0x2

    .line 169
    .line 170
    aget-wide v14, v0, v1

    .line 171
    .line 172
    long-to-int v8, v14

    .line 173
    and-int/2addr v3, v8

    .line 174
    if-ne v3, v11, :cond_4

    .line 175
    .line 176
    move v9, v5

    .line 177
    :cond_4
    if-nez v9, :cond_5

    .line 178
    .line 179
    new-instance v3, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v4, " without valid parent index or parent "

    .line 188
    .line 189
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v4, " not found"

    .line 196
    .line 197
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-static {v3}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_5
    sub-int v2, v6, v2

    .line 208
    .line 209
    div-int/lit8 v2, v2, 0x3

    .line 210
    .line 211
    sget v3, Ldefpackage/xv3;->b:I

    .line 212
    .line 213
    const-wide v3, -0xffc000000000001L    # -3.8812952307517716E231

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    and-long/2addr v3, v14

    .line 219
    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    int-to-long v7, v2

    .line 224
    shl-long/2addr v7, v13

    .line 225
    or-long v2, v3, v7

    .line 226
    .line 227
    aput-wide v2, v0, v1

    .line 228
    .line 229
    return v6
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Shader;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/ue1;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "SongRepository"

    .line 7
    .line 8
    const-string p1, "fetchSimilarOnly.onFailure()"

    .line 9
    .line 10
    invoke-static {p0, p1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const-string p0, "SongRepository"

    .line 15
    .line 16
    const-string p1, "fetchSimilarByArtist.onFailure()"

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3

    .line 1
    iget p1, p0, Ldefpackage/ue1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ldefpackage/xi4;

    .line 10
    .line 11
    const-string v1, "similarSongs"

    .line 12
    .line 13
    invoke-static {p1, p2, v1}, Ldefpackage/xi4;->h(Ldefpackage/xi4;Lretrofit2/Response;Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    iget p2, p0, Ldefpackage/ue1;->o:I

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget-object p0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ldefpackage/eg0;

    .line 36
    .line 37
    invoke-interface {p1, v0, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p2, p0, Ldefpackage/eg0;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p2, Ljava/util/HashSet;

    .line 44
    .line 45
    iget-object v0, p0, Ldefpackage/eg0;->p:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    iget-object p0, p0, Ldefpackage/eg0;->q:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Ldefpackage/k03;

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_0

    .line 78
    .line 79
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void

    .line 94
    :pswitch_0
    iget-object p1, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Ldefpackage/xi4;

    .line 97
    .line 98
    const-string v1, "similarSongs2"

    .line 99
    .line 100
    invoke-static {p1, p2, v1}, Ldefpackage/xi4;->h(Ldefpackage/xi4;Lretrofit2/Response;Ljava/lang/String;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance p2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v1, "fetchSimilarByArtist.onResponse() - similar songs: "

    .line 107
    .line 108
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    const-string v1, "SongRepository"

    .line 123
    .line 124
    invoke-static {v1, p2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_3

    .line 132
    .line 133
    iget p2, p0, Ldefpackage/ue1;->o:I

    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-interface {p1, v0, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, Ldefpackage/wi4;

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ldefpackage/wi4;->a(Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public p()Ldefpackage/l31;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/MediaDrm;->getProvisionRequest()Landroid/media/MediaDrm$ProvisionRequest;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ldefpackage/l31;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/MediaDrm$ProvisionRequest;->getData()[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Landroid/media/MediaDrm$ProvisionRequest;->getDefaultUrl()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0, v1}, Ldefpackage/l31;-><init>(Ljava/lang/String;[B)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public q(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, Ldefpackage/un2;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Ldefpackage/f35;->i0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Ldefpackage/f35;->i0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Ldefpackage/un2;-><init>(IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldefpackage/pt2;

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, Ldefpackage/pt2;-><init>(Ldefpackage/ue1;Ldefpackage/ed2;Ldefpackage/un2;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Ldefpackage/ue1;->i(Ldefpackage/wc0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public r(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, Ldefpackage/un2;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Ldefpackage/f35;->i0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Ldefpackage/f35;->i0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Ldefpackage/un2;-><init>(IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldefpackage/pt2;

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, Ldefpackage/pt2;-><init>(Ldefpackage/ue1;Ldefpackage/ed2;Ldefpackage/un2;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Ldefpackage/ue1;->i(Ldefpackage/wc0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public s(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 10

    .line 1
    new-instance v0, Ldefpackage/un2;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Ldefpackage/f35;->i0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Ldefpackage/f35;->i0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Ldefpackage/un2;-><init>(IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    move-object p5, v0

    .line 21
    new-instance p2, Ldefpackage/qt2;

    .line 22
    .line 23
    move-object p3, p0

    .line 24
    move-object p4, p1

    .line 25
    move-object/from16 p6, p11

    .line 26
    .line 27
    move/from16 p7, p12

    .line 28
    .line 29
    invoke-direct/range {p2 .. p7}, Ldefpackage/qt2;-><init>(Ldefpackage/ue1;Ldefpackage/ed2;Ldefpackage/un2;Ljava/io/IOException;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Ldefpackage/ue1;->i(Ldefpackage/wc0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public t(Landroid/util/AttributeSet;I)V
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v2, Ldefpackage/st3;->f:[I

    .line 11
    .line 12
    invoke-static {p0, p1, v2, p2}, Ldefpackage/jv3;->f(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ldefpackage/jv3;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v1, p0, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v7, v1

    .line 19
    check-cast v7, Landroid/content/res/TypedArray;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, p0, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    check-cast v4, Landroid/content/res/TypedArray;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v3, p1

    .line 32
    move v5, p2

    .line 33
    invoke-static/range {v0 .. v6}, Ldefpackage/j65;->n(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const/4 p2, -0x1

    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {v7, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v1, p2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1, v1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-static {p1}, Ldefpackage/aw0;->a(Landroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    const/4 p1, 0x2

    .line 73
    invoke-virtual {v7, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    const/4 p1, 0x3

    .line 87
    invoke-virtual {v7, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {v7, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    const/4 p2, 0x0

    .line 98
    invoke-static {p1, p2}, Ldefpackage/aw0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-virtual {p0}, Ldefpackage/jv3;->g()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :goto_1
    invoke-virtual {p0}, Ldefpackage/jv3;->g()V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/ue1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ldefpackage/pr3;

    .line 19
    .line 20
    sget-object v2, Ldefpackage/pr3;->p:Ldefpackage/pr3;

    .line 21
    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    const-string v1, "HTTP/1.0"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v1, "HTTP/1.1"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :goto_0
    const/16 v1, 0x20

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget v2, p0, Ldefpackage/ue1;->o:I

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ldefpackage/ed2;IILdefpackage/tb1;ILjava/lang/Object;JJI)V
    .locals 10

    .line 1
    new-instance v0, Ldefpackage/un2;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Ldefpackage/f35;->i0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Ldefpackage/f35;->i0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Ldefpackage/un2;-><init>(IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldefpackage/ot2;

    .line 21
    .line 22
    move/from16 p3, p11

    .line 23
    .line 24
    invoke-direct {p2, p0, p1, v0, p3}, Ldefpackage/ot2;-><init>(Ldefpackage/ue1;Ldefpackage/ed2;Ldefpackage/un2;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, Ldefpackage/ue1;->i(Ldefpackage/wc0;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public v([B)Ldefpackage/se1;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/se1;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/UUID;

    .line 6
    .line 7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v2, 0x1b

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    sget-object v1, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 14
    .line 15
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object p0, Ldefpackage/ax;->b:Ljava/util/UUID;

    .line 22
    .line 23
    :cond_0
    invoke-direct {v0, p0, p1}, Ldefpackage/se1;-><init>(Ljava/util/UUID;[B)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public w()[B
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaDrm;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/MediaDrm;->openSession()[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public x(Ljava/lang/Object;Ljava/lang/Object;)Ldefpackage/ue1;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/ue1;->o:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [Ljava/lang/Object;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-le v0, v2, :cond_0

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    invoke-static {v2, v0}, Ldefpackage/qw1;->b(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_0
    invoke-static {p1, p2}, Ldefpackage/uc5;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, [Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, p0, Ldefpackage/ue1;->o:I

    .line 33
    .line 34
    mul-int/lit8 v2, v1, 0x2

    .line 35
    .line 36
    aput-object p1, v0, v2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    aput-object p2, v0, v2

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    iput v1, p0, Ldefpackage/ue1;->o:I

    .line 45
    .line 46
    return-object p0
.end method

.method public y(Ljava/lang/Iterable;)Ldefpackage/ue1;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/ue1;->o:I

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v1, v0

    .line 15
    mul-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, [Ljava/lang/Object;

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    if-le v1, v2, :cond_0

    .line 23
    .line 24
    array-length v2, v0

    .line 25
    invoke-static {v2, v1}, Ldefpackage/qw1;->b(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v1, v0}, Ldefpackage/ue1;->x(Ljava/lang/Object;Ljava/lang/Object;)Ldefpackage/ue1;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-object p0
.end method

.method public z(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1, p1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ldefpackage/aw0;->a(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Ldefpackage/ue1;->b()V

    .line 29
    .line 30
    .line 31
    return-void
.end method
