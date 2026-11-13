.class public final Ldefpackage/hn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/q44;


# instance fields
.field public final n:I

.field public final o:Ldefpackage/ln1;

.field public p:I


# direct methods
.method public constructor <init>(Ldefpackage/ln1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/hn1;->o:Ldefpackage/ln1;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/hn1;->n:I

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Ldefpackage/hn1;->p:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/hn1;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/hn1;->o:Ldefpackage/ln1;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/ln1;->v()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Ldefpackage/ln1;->X:[I

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v3, v0, Ldefpackage/ln1;->X:[I

    .line 24
    .line 25
    iget v4, p0, Ldefpackage/hn1;->n:I

    .line 26
    .line 27
    aget v3, v3, v4

    .line 28
    .line 29
    const/4 v5, -0x2

    .line 30
    if-ne v3, v2, :cond_2

    .line 31
    .line 32
    iget-object v1, v0, Ldefpackage/ln1;->W:Ljava/util/Set;

    .line 33
    .line 34
    iget-object v0, v0, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/4 v3, -0x3

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    :goto_1
    move v3, v5

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget-object v0, v0, Ldefpackage/ln1;->a0:[Z

    .line 51
    .line 52
    aget-boolean v2, v0, v3

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    aput-boolean v1, v0, v3

    .line 58
    .line 59
    :goto_2
    iput v3, p0, Ldefpackage/hn1;->p:I

    .line 60
    .line 61
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/hn1;->p:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, -0x3

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, -0x2

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/hn1;->p:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/hn1;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Ldefpackage/hn1;->p:I

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/hn1;->o:Ldefpackage/ln1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 23
    .line 24
    aget-object v0, v1, v0

    .line 25
    .line 26
    iget-boolean p0, p0, Ldefpackage/ln1;->g0:Z

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ldefpackage/p44;->s(Z)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method public final s()V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/hn1;->p:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    iget-object v2, p0, Ldefpackage/hn1;->o:Ldefpackage/ln1;

    .line 5
    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Ldefpackage/ln1;->G()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 p0, -0x3

    .line 16
    if-eq v0, p0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v2}, Ldefpackage/ln1;->G()V

    .line 19
    .line 20
    .line 21
    iget-object p0, v2, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 22
    .line 23
    aget-object p0, p0, v0

    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/p44;->h:Ldefpackage/pw0;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ldefpackage/pw0;->getState()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq v0, v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object p0, p0, Ldefpackage/p44;->h:Ldefpackage/pw0;

    .line 38
    .line 39
    invoke-interface {p0}, Ldefpackage/pw0;->g()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    :goto_0
    return-void

    .line 48
    :cond_3
    new-instance v0, Landroidx/media3/exoplayer/hls/SampleQueueMappingException;

    .line 49
    .line 50
    invoke-virtual {v2}, Ldefpackage/ln1;->v()V

    .line 51
    .line 52
    .line 53
    iget-object v1, v2, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 54
    .line 55
    iget p0, p0, Ldefpackage/hn1;->n:I

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/4 v1, 0x0

    .line 62
    iget-object p0, p0, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 63
    .line 64
    aget-object p0, p0, v1

    .line 65
    .line 66
    iget-object p0, p0, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 67
    .line 68
    const-string v1, "Unable to bind a sample queue to TrackGroup with MIME type "

    .line 69
    .line 70
    const-string v2, "."

    .line 71
    .line 72
    invoke-static {v1, p0, v2}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0
.end method

.method public final t(Ldefpackage/gp3;Ldefpackage/cj0;I)I
    .locals 18

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
    iget v3, v0, Ldefpackage/hn1;->p:I

    .line 8
    .line 9
    const/4 v4, -0x3

    .line 10
    if-ne v3, v4, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    invoke-virtual {v2, v0}, Ldefpackage/uv;->a(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, -0x4

    .line 17
    return v0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ldefpackage/hn1;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_c

    .line 23
    .line 24
    iget v3, v0, Ldefpackage/hn1;->p:I

    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/hn1;->o:Ldefpackage/ln1;

    .line 27
    .line 28
    iget-object v5, v0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0}, Ldefpackage/ln1;->E()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x0

    .line 43
    if-nez v6, :cond_6

    .line 44
    .line 45
    move v6, v7

    .line 46
    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    add-int/lit8 v8, v8, -0x1

    .line 51
    .line 52
    if-ge v6, v8, :cond_4

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, Ldefpackage/nm1;

    .line 59
    .line 60
    iget v8, v8, Ldefpackage/nm1;->k:I

    .line 61
    .line 62
    iget-object v9, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 63
    .line 64
    array-length v9, v9

    .line 65
    move v10, v7

    .line 66
    :goto_1
    if-ge v10, v9, :cond_3

    .line 67
    .line 68
    iget-object v11, v0, Ldefpackage/ln1;->a0:[Z

    .line 69
    .line 70
    aget-boolean v11, v11, v10

    .line 71
    .line 72
    if-eqz v11, :cond_2

    .line 73
    .line 74
    iget-object v11, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 75
    .line 76
    aget-object v11, v11, v10

    .line 77
    .line 78
    invoke-virtual {v11}, Ldefpackage/p44;->v()J

    .line 79
    .line 80
    .line 81
    move-result-wide v11

    .line 82
    int-to-long v13, v8

    .line 83
    cmp-long v11, v11, v13

    .line 84
    .line 85
    if-nez v11, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    :goto_2
    invoke-static {v5, v7, v6}, Ldefpackage/f35;->X(Ljava/util/ArrayList;II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Ldefpackage/nm1;

    .line 102
    .line 103
    iget-object v11, v6, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 104
    .line 105
    iget-object v8, v0, Ldefpackage/ln1;->T:Ldefpackage/tb1;

    .line 106
    .line 107
    invoke-virtual {v11, v8}, Ldefpackage/tb1;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-nez v8, :cond_5

    .line 112
    .line 113
    iget-object v8, v0, Ldefpackage/ln1;->x:Ldefpackage/ue1;

    .line 114
    .line 115
    iget v10, v0, Ldefpackage/ln1;->o:I

    .line 116
    .line 117
    iget v12, v6, Ldefpackage/s20;->e:I

    .line 118
    .line 119
    iget-object v13, v6, Ldefpackage/s20;->f:Ljava/lang/Object;

    .line 120
    .line 121
    iget-wide v14, v6, Ldefpackage/s20;->g:J

    .line 122
    .line 123
    move-object v6, v8

    .line 124
    new-instance v8, Ldefpackage/un2;

    .line 125
    .line 126
    invoke-static {v14, v15}, Ldefpackage/f35;->i0(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v14

    .line 130
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    const/4 v9, 0x1

    .line 136
    invoke-direct/range {v8 .. v17}, Ldefpackage/un2;-><init>(IILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 137
    .line 138
    .line 139
    new-instance v9, Ldefpackage/bt2;

    .line 140
    .line 141
    invoke-direct {v9, v6, v8}, Ldefpackage/bt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v9}, Ldefpackage/ue1;->i(Ldefpackage/wc0;)V

    .line 145
    .line 146
    .line 147
    :cond_5
    iput-object v11, v0, Ldefpackage/ln1;->T:Ldefpackage/tb1;

    .line 148
    .line 149
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-nez v6, :cond_7

    .line 154
    .line 155
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    check-cast v6, Ldefpackage/nm1;

    .line 160
    .line 161
    invoke-virtual {v6}, Ldefpackage/nm1;->f()Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-nez v6, :cond_7

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    iget-object v4, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 169
    .line 170
    aget-object v4, v4, v3

    .line 171
    .line 172
    iget-boolean v6, v0, Ldefpackage/ln1;->g0:Z

    .line 173
    .line 174
    move/from16 v8, p3

    .line 175
    .line 176
    invoke-virtual {v4, v1, v2, v8, v6}, Ldefpackage/p44;->w(Ldefpackage/gp3;Ldefpackage/cj0;IZ)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    const/4 v4, -0x5

    .line 181
    if-ne v2, v4, :cond_b

    .line 182
    .line 183
    iget-object v4, v1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v4, Ldefpackage/tb1;

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget v6, v0, Ldefpackage/ln1;->O:I

    .line 191
    .line 192
    if-ne v3, v6, :cond_a

    .line 193
    .line 194
    iget-object v6, v0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 195
    .line 196
    aget-object v3, v6, v3

    .line 197
    .line 198
    invoke-virtual {v3}, Ldefpackage/p44;->v()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    invoke-static {v8, v9}, Ldefpackage/jz4;->m(J)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-ge v7, v6, :cond_8

    .line 211
    .line 212
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    check-cast v6, Ldefpackage/nm1;

    .line 217
    .line 218
    iget v6, v6, Ldefpackage/nm1;->k:I

    .line 219
    .line 220
    if-eq v6, v3, :cond_8

    .line 221
    .line 222
    add-int/lit8 v7, v7, 0x1

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-ge v7, v3, :cond_9

    .line 230
    .line 231
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Ldefpackage/nm1;

    .line 236
    .line 237
    iget-object v0, v0, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_9
    iget-object v0, v0, Ldefpackage/ln1;->S:Ldefpackage/tb1;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    :goto_4
    invoke-virtual {v4, v0}, Ldefpackage/tb1;->d(Ldefpackage/tb1;)Ldefpackage/tb1;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    :cond_a
    iput-object v4, v1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 250
    .line 251
    :cond_b
    return v2

    .line 252
    :cond_c
    :goto_5
    return v4
.end method

.method public final u(J)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/hn1;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget v0, p0, Ldefpackage/hn1;->p:I

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/hn1;->o:Ldefpackage/ln1;

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/ln1;->E()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v1, p0, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 19
    .line 20
    aget-object v1, v1, v0

    .line 21
    .line 22
    iget-boolean v2, p0, Ldefpackage/ln1;->g0:Z

    .line 23
    .line 24
    invoke-virtual {v1, v2, p1, p2}, Ldefpackage/p44;->q(ZJ)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object p0, p0, Ldefpackage/ln1;->A:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    add-int/lit8 p2, p2, -0x1

    .line 44
    .line 45
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    move-object p0, p2

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 73
    :goto_1
    check-cast p0, Ldefpackage/nm1;

    .line 74
    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    invoke-virtual {p0}, Ldefpackage/nm1;->f()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v1}, Ldefpackage/p44;->o()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p0, v0}, Ldefpackage/nm1;->e(I)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    sub-int/2addr p0, p2

    .line 92
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    :cond_5
    invoke-virtual {v1, p1}, Ldefpackage/p44;->A(I)V

    .line 97
    .line 98
    .line 99
    return p1

    .line 100
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 101
    return p0
.end method
