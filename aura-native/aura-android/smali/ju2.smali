.class public abstract Lju2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lhd5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhd5;

    .line 2
    .line 3
    const-string v1, "androidx.media3.session.MediaLibraryService"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lhd5;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lju2;->a:Lhd5;

    .line 10
    .line 11
    return-void
.end method

.method public static a(Lza4;Lza4;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lza4;->a:Lpi3;

    .line 2
    .line 3
    iget v0, p0, Lpi3;->b:I

    .line 4
    .line 5
    iget-object p1, p1, Lza4;->a:Lpi3;

    .line 6
    .line 7
    iget v1, p1, Lpi3;->b:I

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lpi3;->e:I

    .line 12
    .line 13
    iget v1, p1, Lpi3;->e:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lpi3;->h:I

    .line 18
    .line 19
    iget v1, p1, Lpi3;->h:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    iget p0, p0, Lpi3;->i:I

    .line 24
    .line 25
    iget p1, p1, Lpi3;->i:I

    .line 26
    .line 27
    if-ne p0, p1, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static b(JJ)I
    .locals 4

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    cmp-long v0, p2, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v0, p2, v0

    .line 19
    .line 20
    const/16 v1, 0x64

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lf35;->V(JJ)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0, v3, v1}, Lf35;->j(III)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_0
    return v3
.end method

.method public static c(Llk3;JJJ)J
    .locals 4

    .line 1
    iget-object v0, p0, Llk3;->c:Lza4;

    .line 2
    .line 3
    iget-object v1, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    sget-object v2, Lza4;->l:Lza4;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lza4;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-wide v2, v1, Lza4;->c:J

    .line 14
    .line 15
    cmp-long p3, p3, v2

    .line 16
    .line 17
    if-gez p3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p3, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 p3, 0x1

    .line 23
    :goto_1
    iget-boolean p4, p0, Llk3;->x:Z

    .line 24
    .line 25
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    if-nez p4, :cond_3

    .line 31
    .line 32
    if-nez p3, :cond_2

    .line 33
    .line 34
    cmp-long p0, p1, v2

    .line 35
    .line 36
    if-nez p0, :cond_4

    .line 37
    .line 38
    :cond_2
    iget-object p0, v1, Lza4;->a:Lpi3;

    .line 39
    .line 40
    iget-wide p0, p0, Lpi3;->f:J

    .line 41
    .line 42
    return-wide p0

    .line 43
    :cond_3
    if-nez p3, :cond_5

    .line 44
    .line 45
    cmp-long p3, p1, v2

    .line 46
    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    :cond_4
    return-wide p1

    .line 50
    :cond_5
    cmp-long p1, p5, v2

    .line 51
    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    iget-wide p3, v1, Lza4;->c:J

    .line 60
    .line 61
    sub-long p5, p1, p3

    .line 62
    .line 63
    :goto_2
    iget-object p1, v1, Lza4;->a:Lpi3;

    .line 64
    .line 65
    iget-wide p1, p1, Lpi3;->f:J

    .line 66
    .line 67
    long-to-float p3, p5

    .line 68
    iget-object p0, p0, Llk3;->g:Lqh3;

    .line 69
    .line 70
    iget p0, p0, Lqh3;->a:F

    .line 71
    .line 72
    mul-float/2addr p3, p0

    .line 73
    float-to-long p3, p3

    .line 74
    add-long/2addr p1, p3

    .line 75
    iget-wide p3, v1, Lza4;->d:J

    .line 76
    .line 77
    cmp-long p0, p3, v2

    .line 78
    .line 79
    if-eqz p0, :cond_7

    .line 80
    .line 81
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide p0

    .line 85
    return-wide p0

    .line 86
    :cond_7
    return-wide p1
.end method

.method public static d(Lmi3;Lmi3;)Lmi3;
    .locals 6

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    iget-object p0, p0, Lmi3;->a:Lw71;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    iget-object v3, p0, Lw71;->a:Landroid/util/SparseBooleanArray;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/util/SparseBooleanArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    if-ge v2, v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lw71;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1, v3}, Lmi3;->a(I)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lw71;->b(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v5, 0x0

    .line 39
    xor-int/2addr v5, v4

    .line 40
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p0, Lmi3;

    .line 50
    .line 51
    xor-int/lit8 p1, v1, 0x1

    .line 52
    .line 53
    invoke-static {p1}, Lrr2;->w(Z)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lw71;

    .line 57
    .line 58
    invoke-direct {p1, v0}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, p1}, Lmi3;-><init>(Lw71;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    :goto_1
    sget-object p0, Lmi3;->b:Lmi3;

    .line 66
    .line 67
    return-object p0
.end method

.method public static e(Llk3;Llk3;Ljk3;Lmi3;ZLcb4;)Llk3;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    iget-boolean v5, v2, Ljk3;->a:Z

    .line 12
    .line 13
    if-eqz v5, :cond_3

    .line 14
    .line 15
    const/16 v5, 0x11

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Lmi3;->a(I)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_3

    .line 22
    .line 23
    iget-object v5, v0, Llk3;->j:Lcu4;

    .line 24
    .line 25
    invoke-virtual {v5}, Lcu4;->p()Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-nez v8, :cond_1

    .line 30
    .line 31
    iget-object v8, v1, Llk3;->c:Lza4;

    .line 32
    .line 33
    iget-object v8, v8, Lza4;->a:Lpi3;

    .line 34
    .line 35
    iget v8, v8, Lpi3;->b:I

    .line 36
    .line 37
    invoke-virtual {v5}, Lcu4;->o()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-ge v8, v9, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v8, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 v8, 0x1

    .line 47
    :goto_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v10, "Invalid PlayerInfo update, old index: "

    .line 50
    .line 51
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v10, v0, Llk3;->c:Lza4;

    .line 55
    .line 56
    iget-object v10, v10, Lza4;->a:Lpi3;

    .line 57
    .line 58
    iget v10, v10, Lpi3;->b:I

    .line 59
    .line 60
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v10, " (count="

    .line 64
    .line 65
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Lcu4;->o()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v10, "), new index = "

    .line 76
    .line 77
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v10, v1, Llk3;->c:Lza4;

    .line 81
    .line 82
    iget-object v10, v10, Lza4;->a:Lpi3;

    .line 83
    .line 84
    iget v10, v10, Lpi3;->b:I

    .line 85
    .line 86
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v10, ", sent from "

    .line 90
    .line 91
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v10, v4, Lcb4;->a:Lbb4;

    .line 95
    .line 96
    invoke-interface {v10}, Lbb4;->g()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v10, ", interface version="

    .line 104
    .line 105
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v4, v4, Lcb4;->a:Lbb4;

    .line 109
    .line 110
    invoke-interface {v4}, Lbb4;->f()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-eqz v8, :cond_2

    .line 122
    .line 123
    invoke-virtual {v1, v5}, Llk3;->l(Lcu4;)Llk3;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    invoke-static {v4}, Lkf2;->o(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    return-object v0

    .line 133
    :cond_3
    move-object v4, v1

    .line 134
    :goto_2
    iget-boolean v2, v2, Ljk3;->b:Z

    .line 135
    .line 136
    if-eqz v2, :cond_4

    .line 137
    .line 138
    const/16 v2, 0x1e

    .line 139
    .line 140
    invoke-virtual {v3, v2}, Lmi3;->a(I)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_4

    .line 145
    .line 146
    iget-object v2, v0, Llk3;->F:Ljw4;

    .line 147
    .line 148
    invoke-virtual {v4, v2}, Llk3;->b(Ljw4;)Llk3;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    :cond_4
    if-eqz p4, :cond_7

    .line 153
    .line 154
    iget v1, v1, Llk3;->n:F

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    cmpl-float v1, v1, v2

    .line 158
    .line 159
    if-nez v1, :cond_7

    .line 160
    .line 161
    iget v0, v0, Llk3;->o:F

    .line 162
    .line 163
    iget-object v9, v4, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 164
    .line 165
    iget v10, v4, Llk3;->b:I

    .line 166
    .line 167
    iget-object v11, v4, Llk3;->c:Lza4;

    .line 168
    .line 169
    iget-object v12, v4, Llk3;->d:Lpi3;

    .line 170
    .line 171
    iget-object v13, v4, Llk3;->e:Lpi3;

    .line 172
    .line 173
    iget v14, v4, Llk3;->f:I

    .line 174
    .line 175
    iget-object v15, v4, Llk3;->g:Lqh3;

    .line 176
    .line 177
    iget v1, v4, Llk3;->h:I

    .line 178
    .line 179
    iget-boolean v2, v4, Llk3;->i:Z

    .line 180
    .line 181
    iget-object v3, v4, Llk3;->j:Lcu4;

    .line 182
    .line 183
    iget v5, v4, Llk3;->k:I

    .line 184
    .line 185
    iget-object v8, v4, Llk3;->l:Ls55;

    .line 186
    .line 187
    iget-object v6, v4, Llk3;->m:Ldo2;

    .line 188
    .line 189
    iget v7, v4, Llk3;->n:F

    .line 190
    .line 191
    move/from16 v23, v0

    .line 192
    .line 193
    iget v0, v4, Llk3;->p:I

    .line 194
    .line 195
    move/from16 v25, v0

    .line 196
    .line 197
    iget-object v0, v4, Llk3;->q:Lil;

    .line 198
    .line 199
    move-object/from16 v24, v0

    .line 200
    .line 201
    iget-object v0, v4, Llk3;->r:Ljg0;

    .line 202
    .line 203
    move-object/from16 v26, v0

    .line 204
    .line 205
    iget-object v0, v4, Llk3;->s:Lhp0;

    .line 206
    .line 207
    move-object/from16 v27, v0

    .line 208
    .line 209
    iget v0, v4, Llk3;->t:I

    .line 210
    .line 211
    move/from16 v28, v0

    .line 212
    .line 213
    iget-boolean v0, v4, Llk3;->u:Z

    .line 214
    .line 215
    move/from16 v29, v0

    .line 216
    .line 217
    iget-boolean v0, v4, Llk3;->v:Z

    .line 218
    .line 219
    move/from16 v30, v0

    .line 220
    .line 221
    iget v0, v4, Llk3;->w:I

    .line 222
    .line 223
    move/from16 v31, v0

    .line 224
    .line 225
    iget-boolean v0, v4, Llk3;->x:Z

    .line 226
    .line 227
    move/from16 v34, v0

    .line 228
    .line 229
    iget-boolean v0, v4, Llk3;->y:Z

    .line 230
    .line 231
    move/from16 v35, v0

    .line 232
    .line 233
    iget v0, v4, Llk3;->z:I

    .line 234
    .line 235
    move/from16 v32, v0

    .line 236
    .line 237
    iget v0, v4, Llk3;->A:I

    .line 238
    .line 239
    move/from16 v33, v0

    .line 240
    .line 241
    iget-object v0, v4, Llk3;->B:Ldo2;

    .line 242
    .line 243
    move-object/from16 v36, v0

    .line 244
    .line 245
    move/from16 v18, v1

    .line 246
    .line 247
    iget-wide v0, v4, Llk3;->C:J

    .line 248
    .line 249
    move-wide/from16 v37, v0

    .line 250
    .line 251
    iget-wide v0, v4, Llk3;->D:J

    .line 252
    .line 253
    move-wide/from16 v39, v0

    .line 254
    .line 255
    iget-wide v0, v4, Llk3;->E:J

    .line 256
    .line 257
    move-wide/from16 v41, v0

    .line 258
    .line 259
    iget-object v0, v4, Llk3;->F:Ljw4;

    .line 260
    .line 261
    iget-object v1, v4, Llk3;->G:Lcw4;

    .line 262
    .line 263
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-nez v4, :cond_6

    .line 268
    .line 269
    iget-object v4, v11, Lza4;->a:Lpi3;

    .line 270
    .line 271
    iget v4, v4, Lpi3;->b:I

    .line 272
    .line 273
    move-object/from16 v43, v0

    .line 274
    .line 275
    invoke-virtual {v3}, Lcu4;->o()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-ge v4, v0, :cond_5

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_5
    const/16 v16, 0x0

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_6
    move-object/from16 v43, v0

    .line 286
    .line 287
    :goto_3
    const/16 v16, 0x1

    .line 288
    .line 289
    :goto_4
    invoke-static/range {v16 .. v16}, Lrr2;->w(Z)V

    .line 290
    .line 291
    .line 292
    move/from16 v16, v18

    .line 293
    .line 294
    move-object/from16 v18, v8

    .line 295
    .line 296
    new-instance v8, Llk3;

    .line 297
    .line 298
    move-object/from16 v44, v1

    .line 299
    .line 300
    move/from16 v17, v2

    .line 301
    .line 302
    move-object/from16 v19, v3

    .line 303
    .line 304
    move/from16 v20, v5

    .line 305
    .line 306
    move-object/from16 v21, v6

    .line 307
    .line 308
    move/from16 v22, v7

    .line 309
    .line 310
    invoke-direct/range {v8 .. v44}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 311
    .line 312
    .line 313
    return-object v8

    .line 314
    :cond_7
    return-object v4
.end method

.method public static f(Lqi3;Lgr2;)V
    .locals 7

    .line 1
    iget v0, p1, Lgr2;->b:I

    .line 2
    .line 3
    iget-wide v1, p1, Lgr2;->c:J

    .line 4
    .line 5
    iget-object v3, p1, Lgr2;->a:Lyw1;

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/16 v6, 0x14

    .line 10
    .line 11
    if-ne v0, v4, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v6}, Lqi3;->S0(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, v3}, Lqi3;->L0(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_3

    .line 28
    .line 29
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lgn2;

    .line 34
    .line 35
    invoke-interface {p0, p1}, Lqi3;->B0(Lgn2;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-interface {p0, v6}, Lqi3;->S0(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget p1, p1, Lgr2;->b:I

    .line 46
    .line 47
    invoke-interface {p0, v3, p1, v1, v2}, Lqi3;->T(Ljava/util/List;IJ)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lgn2;

    .line 62
    .line 63
    invoke-interface {p0, p1, v1, v2}, Lqi3;->p(Lgn2;J)V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void
.end method

.method public static g(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ge v3, v4, :cond_0

    .line 17
    .line 18
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Landroid/os/Parcelable;

    .line 23
    .line 24
    invoke-virtual {v1, v4, v2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/os/Parcel;->dataSize()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/high16 v6, 0x40000

    .line 32
    .line 33
    if-ge v5, v6, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 48
    .line 49
    .line 50
    throw p0
.end method
