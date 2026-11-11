.class public abstract Llq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A:Lyx;

.field public B:Ljava/lang/Class;

.field public C:Z

.field public D:Landroid/content/res/Resources$Theme;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public n:I

.field public o:F

.field public p:Lxq0;

.field public q:Leq3;

.field public r:Landroid/graphics/drawable/Drawable;

.field public s:Landroid/graphics/drawable/ColorDrawable;

.field public t:Z

.field public u:I

.field public v:I

.field public w:Lf42;

.field public x:Z

.field public y:Landroid/graphics/drawable/Drawable;

.field public z:Ldb3;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Llq;->o:F

    .line 7
    .line 8
    sget-object v0, Lxq0;->e:Lxq0;

    .line 9
    .line 10
    iput-object v0, p0, Llq;->p:Lxq0;

    .line 11
    .line 12
    sget-object v0, Leq3;->p:Leq3;

    .line 13
    .line 14
    iput-object v0, p0, Llq;->q:Leq3;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Llq;->t:Z

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Llq;->u:I

    .line 21
    .line 22
    iput v1, p0, Llq;->v:I

    .line 23
    .line 24
    sget-object v1, La11;->b:La11;

    .line 25
    .line 26
    iput-object v1, p0, Llq;->w:Lf42;

    .line 27
    .line 28
    new-instance v1, Ldb3;

    .line 29
    .line 30
    invoke-direct {v1}, Ldb3;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Llq;->z:Ldb3;

    .line 34
    .line 35
    new-instance v1, Lyx;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, v2}, Lyd4;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Llq;->A:Lyx;

    .line 42
    .line 43
    const-class v1, Ljava/lang/Object;

    .line 44
    .line 45
    iput-object v1, p0, Llq;->B:Ljava/lang/Class;

    .line 46
    .line 47
    iput-boolean v0, p0, Llq;->G:Z

    .line 48
    .line 49
    return-void
.end method

.method public static j(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public A(Luw4;)Llq;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Llq;->B(Luw4;Z)Llq;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final B(Luw4;Z)Llq;
    .locals 2

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Llq;->B(Luw4;Z)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lwv0;

    .line 15
    .line 16
    invoke-direct {v0, p1, p2}, Lwv0;-><init>(Luw4;Z)V

    .line 17
    .line 18
    .line 19
    const-class v1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1, p2}, Llq;->C(Ljava/lang/Class;Luw4;Z)Llq;

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, p2}, Llq;->C(Ljava/lang/Class;Luw4;Z)Llq;

    .line 27
    .line 28
    .line 29
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0, p2}, Llq;->C(Ljava/lang/Class;Luw4;Z)Llq;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lxh1;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lxh1;-><init>(Luw4;)V

    .line 37
    .line 38
    .line 39
    const-class p1, Lvh1;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0, p2}, Llq;->C(Ljava/lang/Class;Luw4;Z)Llq;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Llq;->u()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final C(Ljava/lang/Class;Luw4;Z)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Llq;->C(Ljava/lang/Class;Luw4;Z)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p2}, Lh12;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Llq;->A:Lyx;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lyx;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget p1, p0, Llq;->n:I

    .line 23
    .line 24
    const p2, 0x10800

    .line 25
    .line 26
    .line 27
    or-int/2addr p2, p1

    .line 28
    iput p2, p0, Llq;->n:I

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    iput-boolean p2, p0, Llq;->G:Z

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    const p2, 0x30800

    .line 36
    .line 37
    .line 38
    or-int/2addr p1, p2

    .line 39
    iput p1, p0, Llq;->n:I

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Llq;->x:Z

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Llq;->u()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public varargs D([Luw4;)Llq;
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x1

    .line 3
    if-le v0, v1, :cond_0

    .line 4
    .line 5
    new-instance v0, Llz2;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Llz2;-><init>([Luw4;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Llq;->B(Luw4;Z)Llq;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    array-length v0, p1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Llq;->A(Luw4;)Llq;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p0}, Llq;->u()V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public E()Llq;
    .locals 2

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llq;->E()Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Llq;->H:Z

    .line 16
    .line 17
    iget v0, p0, Llq;->n:I

    .line 18
    .line 19
    const/high16 v1, 0x100000

    .line 20
    .line 21
    or-int/2addr v0, v1

    .line 22
    iput v0, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public a(Llq;)Llq;
    .locals 3

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->a(Llq;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget v0, p1, Llq;->n:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget v0, p1, Llq;->o:F

    .line 24
    .line 25
    iput v0, p0, Llq;->o:F

    .line 26
    .line 27
    :cond_1
    iget v0, p1, Llq;->n:I

    .line 28
    .line 29
    const/high16 v1, 0x100000

    .line 30
    .line 31
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-boolean v0, p1, Llq;->H:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Llq;->H:Z

    .line 40
    .line 41
    :cond_2
    iget v0, p1, Llq;->n:I

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, p1, Llq;->p:Lxq0;

    .line 51
    .line 52
    iput-object v0, p0, Llq;->p:Lxq0;

    .line 53
    .line 54
    :cond_3
    iget v0, p1, Llq;->n:I

    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p1, Llq;->q:Leq3;

    .line 65
    .line 66
    iput-object v0, p0, Llq;->q:Leq3;

    .line 67
    .line 68
    :cond_4
    iget v0, p1, Llq;->n:I

    .line 69
    .line 70
    const/16 v1, 0x10

    .line 71
    .line 72
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v0, p1, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    iput-object v0, p0, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    iget v0, p0, Llq;->n:I

    .line 83
    .line 84
    and-int/lit8 v0, v0, -0x21

    .line 85
    .line 86
    iput v0, p0, Llq;->n:I

    .line 87
    .line 88
    :cond_5
    iget v0, p1, Llq;->n:I

    .line 89
    .line 90
    const/16 v1, 0x20

    .line 91
    .line 92
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const/4 v1, 0x0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    iput-object v1, p0, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 100
    .line 101
    iget v0, p0, Llq;->n:I

    .line 102
    .line 103
    and-int/lit8 v0, v0, -0x11

    .line 104
    .line 105
    iput v0, p0, Llq;->n:I

    .line 106
    .line 107
    :cond_6
    iget v0, p1, Llq;->n:I

    .line 108
    .line 109
    const/16 v2, 0x40

    .line 110
    .line 111
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    iget-object v0, p1, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 118
    .line 119
    iput-object v0, p0, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 120
    .line 121
    iget v0, p0, Llq;->n:I

    .line 122
    .line 123
    and-int/lit16 v0, v0, -0x81

    .line 124
    .line 125
    iput v0, p0, Llq;->n:I

    .line 126
    .line 127
    :cond_7
    iget v0, p1, Llq;->n:I

    .line 128
    .line 129
    const/16 v2, 0x80

    .line 130
    .line 131
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    iput-object v1, p0, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 138
    .line 139
    iget v0, p0, Llq;->n:I

    .line 140
    .line 141
    and-int/lit8 v0, v0, -0x41

    .line 142
    .line 143
    iput v0, p0, Llq;->n:I

    .line 144
    .line 145
    :cond_8
    iget v0, p1, Llq;->n:I

    .line 146
    .line 147
    const/16 v2, 0x100

    .line 148
    .line 149
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_9

    .line 154
    .line 155
    iget-boolean v0, p1, Llq;->t:Z

    .line 156
    .line 157
    iput-boolean v0, p0, Llq;->t:Z

    .line 158
    .line 159
    :cond_9
    iget v0, p1, Llq;->n:I

    .line 160
    .line 161
    const/16 v2, 0x200

    .line 162
    .line 163
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_a

    .line 168
    .line 169
    iget v0, p1, Llq;->v:I

    .line 170
    .line 171
    iput v0, p0, Llq;->v:I

    .line 172
    .line 173
    iget v0, p1, Llq;->u:I

    .line 174
    .line 175
    iput v0, p0, Llq;->u:I

    .line 176
    .line 177
    :cond_a
    iget v0, p1, Llq;->n:I

    .line 178
    .line 179
    const/16 v2, 0x400

    .line 180
    .line 181
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    iget-object v0, p1, Llq;->w:Lf42;

    .line 188
    .line 189
    iput-object v0, p0, Llq;->w:Lf42;

    .line 190
    .line 191
    :cond_b
    iget v0, p1, Llq;->n:I

    .line 192
    .line 193
    const/16 v2, 0x1000

    .line 194
    .line 195
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_c

    .line 200
    .line 201
    iget-object v0, p1, Llq;->B:Ljava/lang/Class;

    .line 202
    .line 203
    iput-object v0, p0, Llq;->B:Ljava/lang/Class;

    .line 204
    .line 205
    :cond_c
    iget v0, p1, Llq;->n:I

    .line 206
    .line 207
    const/16 v2, 0x2000

    .line 208
    .line 209
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_d

    .line 214
    .line 215
    iget-object v0, p1, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 216
    .line 217
    iput-object v0, p0, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 218
    .line 219
    iget v0, p0, Llq;->n:I

    .line 220
    .line 221
    and-int/lit16 v0, v0, -0x4001

    .line 222
    .line 223
    iput v0, p0, Llq;->n:I

    .line 224
    .line 225
    :cond_d
    iget v0, p1, Llq;->n:I

    .line 226
    .line 227
    const/16 v2, 0x4000

    .line 228
    .line 229
    invoke-static {v0, v2}, Llq;->j(II)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_e

    .line 234
    .line 235
    iput-object v1, p0, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 236
    .line 237
    iget v0, p0, Llq;->n:I

    .line 238
    .line 239
    and-int/lit16 v0, v0, -0x2001

    .line 240
    .line 241
    iput v0, p0, Llq;->n:I

    .line 242
    .line 243
    :cond_e
    iget v0, p1, Llq;->n:I

    .line 244
    .line 245
    const v1, 0x8000

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_f

    .line 253
    .line 254
    iget-object v0, p1, Llq;->D:Landroid/content/res/Resources$Theme;

    .line 255
    .line 256
    iput-object v0, p0, Llq;->D:Landroid/content/res/Resources$Theme;

    .line 257
    .line 258
    :cond_f
    iget v0, p1, Llq;->n:I

    .line 259
    .line 260
    const/high16 v1, 0x20000

    .line 261
    .line 262
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_10

    .line 267
    .line 268
    iget-boolean v0, p1, Llq;->x:Z

    .line 269
    .line 270
    iput-boolean v0, p0, Llq;->x:Z

    .line 271
    .line 272
    :cond_10
    iget v0, p1, Llq;->n:I

    .line 273
    .line 274
    const/16 v1, 0x800

    .line 275
    .line 276
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_11

    .line 281
    .line 282
    iget-object v0, p0, Llq;->A:Lyx;

    .line 283
    .line 284
    iget-object v1, p1, Llq;->A:Lyx;

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Loi;->putAll(Ljava/util/Map;)V

    .line 287
    .line 288
    .line 289
    iget-boolean v0, p1, Llq;->G:Z

    .line 290
    .line 291
    iput-boolean v0, p0, Llq;->G:Z

    .line 292
    .line 293
    :cond_11
    iget v0, p1, Llq;->n:I

    .line 294
    .line 295
    const/high16 v1, 0x80000

    .line 296
    .line 297
    invoke-static {v0, v1}, Llq;->j(II)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_12

    .line 302
    .line 303
    iget-boolean v0, p1, Llq;->F:Z

    .line 304
    .line 305
    iput-boolean v0, p0, Llq;->F:Z

    .line 306
    .line 307
    :cond_12
    iget v0, p0, Llq;->n:I

    .line 308
    .line 309
    iget v1, p1, Llq;->n:I

    .line 310
    .line 311
    or-int/2addr v0, v1

    .line 312
    iput v0, p0, Llq;->n:I

    .line 313
    .line 314
    iget-object v0, p0, Llq;->z:Ldb3;

    .line 315
    .line 316
    iget-object p1, p1, Llq;->z:Ldb3;

    .line 317
    .line 318
    iget-object v0, v0, Ldb3;->b:Lyx;

    .line 319
    .line 320
    iget-object p1, p1, Ldb3;->b:Lyx;

    .line 321
    .line 322
    invoke-virtual {v0, p1}, Lyx;->g(Loi;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, Llq;->u()V

    .line 326
    .line 327
    .line 328
    return-object p0
.end method

.method public b()Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Llq;->E:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "You cannot auto lock an already locked options object, try clone() first"

    .line 11
    .line 12
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Llq;->E:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Llq;->k()Llq;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public c()Llq;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Llq;

    .line 6
    .line 7
    new-instance v1, Ldb3;

    .line 8
    .line 9
    invoke-direct {v1}, Ldb3;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Llq;->z:Ldb3;

    .line 13
    .line 14
    iget-object v2, p0, Llq;->z:Ldb3;

    .line 15
    .line 16
    iget-object v1, v1, Ldb3;->b:Lyx;

    .line 17
    .line 18
    iget-object v2, v2, Ldb3;->b:Lyx;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lyx;->g(Loi;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lyx;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v2}, Lyd4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Llq;->A:Lyx;

    .line 30
    .line 31
    iget-object p0, p0, Llq;->A:Lyx;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Loi;->putAll(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v2, v0, Llq;->C:Z

    .line 37
    .line 38
    iput-boolean v2, v0, Llq;->E:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    invoke-static {p0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public d(Ljava/lang/Class;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->d(Ljava/lang/Class;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Llq;->B:Ljava/lang/Class;

    .line 15
    .line 16
    iget p1, p0, Llq;->n:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x1000

    .line 19
    .line 20
    iput p1, p0, Llq;->n:I

    .line 21
    .line 22
    invoke-virtual {p0}, Llq;->u()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public e(Lxq0;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->e(Lxq0;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "Argument must not be null"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Llq;->p:Lxq0;

    .line 20
    .line 21
    iget p1, p0, Llq;->n:I

    .line 22
    .line 23
    or-int/lit8 p1, p1, 0x4

    .line 24
    .line 25
    iput p1, p0, Llq;->n:I

    .line 26
    .line 27
    invoke-virtual {p0}, Llq;->u()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Llq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Llq;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Llq;->i(Llq;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public f(Lgu0;)Llq;
    .locals 1

    .line 1
    sget-object v0, Lgu0;->g:Lab3;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Llq;->v(Lab3;Ljava/lang/Object;)Llq;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public g(Landroid/graphics/drawable/Drawable;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->g(Landroid/graphics/drawable/Drawable;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    iget p1, p0, Llq;->n:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x10

    .line 19
    .line 20
    and-int/lit8 p1, p1, -0x21

    .line 21
    .line 22
    iput p1, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public h(Landroid/graphics/drawable/Drawable;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->h(Landroid/graphics/drawable/Drawable;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    iget p1, p0, Llq;->n:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x2000

    .line 19
    .line 20
    and-int/lit16 p1, p1, -0x4001

    .line 21
    .line 22
    iput p1, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Llq;->o:F

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-static {v1, v0}, Le35;->D(IF)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v1, v0}, Le35;->E(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    invoke-static {v0, v2}, Le35;->F(ILjava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v1, v0}, Le35;->E(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 25
    .line 26
    invoke-static {v0, v2}, Le35;->F(ILjava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v1, v0}, Le35;->E(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    invoke-static {v0, v2}, Le35;->F(ILjava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Llq;->t:Z

    .line 41
    .line 42
    invoke-static {v2, v0}, Le35;->E(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Llq;->u:I

    .line 47
    .line 48
    invoke-static {v2, v0}, Le35;->E(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, Llq;->v:I

    .line 53
    .line 54
    invoke-static {v2, v0}, Le35;->E(II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Llq;->x:Z

    .line 59
    .line 60
    invoke-static {v2, v0}, Le35;->E(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-static {v2, v0}, Le35;->E(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v1, v0}, Le35;->E(II)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-boolean v1, p0, Llq;->F:Z

    .line 74
    .line 75
    invoke-static {v1, v0}, Le35;->E(II)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-object v1, p0, Llq;->p:Lxq0;

    .line 80
    .line 81
    invoke-static {v0, v1}, Le35;->F(ILjava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Llq;->q:Leq3;

    .line 86
    .line 87
    invoke-static {v0, v1}, Le35;->F(ILjava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, Llq;->z:Ldb3;

    .line 92
    .line 93
    invoke-static {v0, v1}, Le35;->F(ILjava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-object v1, p0, Llq;->A:Lyx;

    .line 98
    .line 99
    invoke-static {v0, v1}, Le35;->F(ILjava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-object v1, p0, Llq;->B:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v0, v1}, Le35;->F(ILjava/lang/Object;)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v1, p0, Llq;->w:Lf42;

    .line 110
    .line 111
    invoke-static {v0, v1}, Le35;->F(ILjava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object p0, p0, Llq;->D:Landroid/content/res/Resources$Theme;

    .line 116
    .line 117
    invoke-static {v0, p0}, Le35;->F(ILjava/lang/Object;)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    return p0
.end method

.method public final i(Llq;)Z
    .locals 2

    .line 1
    iget v0, p1, Llq;->o:F

    .line 2
    .line 3
    iget v1, p0, Llq;->o:F

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    iget-object v1, p1, Llq;->r:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    invoke-static {v0, v1}, Le35;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 22
    .line 23
    iget-object v1, p1, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 24
    .line 25
    invoke-static {v0, v1}, Le35;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    iget-object v1, p1, Llq;->y:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    invoke-static {v0, v1}, Le35;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-boolean v0, p0, Llq;->t:Z

    .line 42
    .line 43
    iget-boolean v1, p1, Llq;->t:Z

    .line 44
    .line 45
    if-ne v0, v1, :cond_0

    .line 46
    .line 47
    iget v0, p0, Llq;->u:I

    .line 48
    .line 49
    iget v1, p1, Llq;->u:I

    .line 50
    .line 51
    if-ne v0, v1, :cond_0

    .line 52
    .line 53
    iget v0, p0, Llq;->v:I

    .line 54
    .line 55
    iget v1, p1, Llq;->v:I

    .line 56
    .line 57
    if-ne v0, v1, :cond_0

    .line 58
    .line 59
    iget-boolean v0, p0, Llq;->x:Z

    .line 60
    .line 61
    iget-boolean v1, p1, Llq;->x:Z

    .line 62
    .line 63
    if-ne v0, v1, :cond_0

    .line 64
    .line 65
    iget-boolean v0, p0, Llq;->F:Z

    .line 66
    .line 67
    iget-boolean v1, p1, Llq;->F:Z

    .line 68
    .line 69
    if-ne v0, v1, :cond_0

    .line 70
    .line 71
    iget-object v0, p0, Llq;->p:Lxq0;

    .line 72
    .line 73
    iget-object v1, p1, Llq;->p:Lxq0;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    iget-object v0, p0, Llq;->q:Leq3;

    .line 82
    .line 83
    iget-object v1, p1, Llq;->q:Leq3;

    .line 84
    .line 85
    if-ne v0, v1, :cond_0

    .line 86
    .line 87
    iget-object v0, p0, Llq;->z:Ldb3;

    .line 88
    .line 89
    iget-object v1, p1, Llq;->z:Ldb3;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ldb3;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    iget-object v0, p0, Llq;->A:Lyx;

    .line 98
    .line 99
    iget-object v1, p1, Llq;->A:Lyx;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lyd4;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_0

    .line 106
    .line 107
    iget-object v0, p0, Llq;->B:Ljava/lang/Class;

    .line 108
    .line 109
    iget-object v1, p1, Llq;->B:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    .line 117
    iget-object v0, p0, Llq;->w:Lf42;

    .line 118
    .line 119
    iget-object v1, p1, Llq;->w:Lf42;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_0

    .line 126
    .line 127
    iget-object p0, p0, Llq;->D:Landroid/content/res/Resources$Theme;

    .line 128
    .line 129
    iget-object p1, p1, Llq;->D:Landroid/content/res/Resources$Theme;

    .line 130
    .line 131
    invoke-static {p0, p1}, Le35;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_0

    .line 136
    .line 137
    const/4 p0, 0x1

    .line 138
    return p0

    .line 139
    :cond_0
    const/4 p0, 0x0

    .line 140
    return p0
.end method

.method public k()Llq;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Llq;->C:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public l()Llq;
    .locals 2

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Llq;->F:Z

    .line 16
    .line 17
    iget v0, p0, Llq;->n:I

    .line 18
    .line 19
    const/high16 v1, 0x80000

    .line 20
    .line 21
    or-int/2addr v0, v1

    .line 22
    iput v0, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public m()Llq;
    .locals 2

    .line 1
    sget-object v0, Lgu0;->d:Lgu0;

    .line 2
    .line 3
    new-instance v1, Lm00;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Llq;->p(Lgu0;Lbt;)Llq;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public n()Llq;
    .locals 2

    .line 1
    sget-object v0, Lgu0;->c:Lgu0;

    .line 2
    .line 3
    new-instance v1, Ln00;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Llq;->p(Lgu0;Lbt;)Llq;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Llq;->G:Z

    .line 14
    .line 15
    return-object p0
.end method

.method public o()Llq;
    .locals 2

    .line 1
    sget-object v0, Lgu0;->b:Lgu0;

    .line 2
    .line 3
    new-instance v1, Lk71;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Llq;->p(Lgu0;Lbt;)Llq;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Llq;->G:Z

    .line 14
    .line 15
    return-object p0
.end method

.method public final p(Lgu0;Lbt;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Llq;->p(Lgu0;Lbt;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Llq;->f(Lgu0;)Llq;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p2, p1}, Llq;->B(Luw4;Z)Llq;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public q(II)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Llq;->q(II)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput p1, p0, Llq;->v:I

    .line 15
    .line 16
    iput p2, p0, Llq;->u:I

    .line 17
    .line 18
    iget p1, p0, Llq;->n:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public r(Landroid/graphics/drawable/ColorDrawable;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->r(Landroid/graphics/drawable/ColorDrawable;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Llq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 15
    .line 16
    iget p1, p0, Llq;->n:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x40

    .line 19
    .line 20
    and-int/lit16 p1, p1, -0x81

    .line 21
    .line 22
    iput p1, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public s()Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llq;->s()Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Leq3;->q:Leq3;

    .line 15
    .line 16
    iput-object v0, p0, Llq;->q:Leq3;

    .line 17
    .line 18
    iget v0, p0, Llq;->n:I

    .line 19
    .line 20
    or-int/lit8 v0, v0, 0x8

    .line 21
    .line 22
    iput v0, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final t(Lab3;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->t(Lab3;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Llq;->z:Ldb3;

    .line 15
    .line 16
    iget-object v0, v0, Ldb3;->b:Lyx;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lyd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Llq;->u()V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final u()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Llq;->C:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "You cannot modify locked T, consider clone()"

    .line 7
    .line 8
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public v(Lab3;Ljava/lang/Object;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Llq;->v(Lab3;Ljava/lang/Object;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p1}, Lh12;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lh12;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Llq;->z:Ldb3;

    .line 21
    .line 22
    iget-object v0, v0, Ldb3;->b:Lyx;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lyx;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Llq;->u()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public w(Lf42;)Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->w(Lf42;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Llq;->w:Lf42;

    .line 15
    .line 16
    iget p1, p0, Llq;->n:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x400

    .line 19
    .line 20
    iput p1, p0, Llq;->n:I

    .line 21
    .line 22
    invoke-virtual {p0}, Llq;->u()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public x()Llq;
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llq;->x()Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const v0, 0x3dcccccd    # 0.1f

    .line 15
    .line 16
    .line 17
    iput v0, p0, Llq;->o:F

    .line 18
    .line 19
    iget v0, p0, Llq;->n:I

    .line 20
    .line 21
    or-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    iput v0, p0, Llq;->n:I

    .line 24
    .line 25
    invoke-virtual {p0}, Llq;->u()V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public y(Z)Llq;
    .locals 2

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, v1}, Llq;->y(Z)Llq;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    xor-int/2addr p1, v1

    .line 16
    iput-boolean p1, p0, Llq;->t:Z

    .line 17
    .line 18
    iget p1, p0, Llq;->n:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x100

    .line 21
    .line 22
    iput p1, p0, Llq;->n:I

    .line 23
    .line 24
    invoke-virtual {p0}, Llq;->u()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public z(Landroid/content/res/Resources$Theme;)Llq;
    .locals 2

    .line 1
    iget-boolean v0, p0, Llq;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq;->c()Llq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Llq;->z(Landroid/content/res/Resources$Theme;)Llq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Llq;->D:Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    iget v0, p0, Llq;->n:I

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const v1, 0x8000

    .line 21
    .line 22
    .line 23
    or-int/2addr v0, v1

    .line 24
    iput v0, p0, Llq;->n:I

    .line 25
    .line 26
    sget-object v0, Lv04;->b:Lab3;

    .line 27
    .line 28
    invoke-virtual {p0, v0, p1}, Llq;->v(Lab3;Ljava/lang/Object;)Llq;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const p1, -0x8001

    .line 34
    .line 35
    .line 36
    and-int/2addr p1, v0

    .line 37
    iput p1, p0, Llq;->n:I

    .line 38
    .line 39
    sget-object p1, Lv04;->b:Lab3;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Llq;->t(Lab3;)Llq;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
