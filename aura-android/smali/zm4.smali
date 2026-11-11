.class public final Lzm4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:J

.field public f:J

.field public g:Z

.field public h:J

.field public final synthetic i:Lw12;


# direct methods
.method public constructor <init>(Lw12;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzm4;->i:Lw12;

    .line 5
    .line 6
    iput p2, p0, Lzm4;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lzm4;->i:Lw12;

    .line 4
    .line 5
    iget-object v2, v1, Lw12;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lyp4;

    .line 8
    .line 9
    iget-object v3, v1, Lw12;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Li41;

    .line 12
    .line 13
    invoke-virtual {v3}, Li41;->g()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x2

    .line 19
    if-ne v4, v6, :cond_6

    .line 20
    .line 21
    invoke-virtual {v3}, Li41;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_6

    .line 26
    .line 27
    invoke-virtual {v3}, Li41;->v0()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, Li41;->x0()Lcu4;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Lcu4;->p()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_1

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v3}, Li41;->y()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {v4, v7}, Lcu4;->l(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    :goto_0
    invoke-virtual {v3}, Li41;->n0()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    invoke-virtual {v3}, Li41;->K()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-virtual {v3}, Li41;->b0()J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    invoke-virtual {v3}, Li41;->M0()J

    .line 68
    .line 69
    .line 70
    move-result-wide v12

    .line 71
    sub-long v12, v10, v12

    .line 72
    .line 73
    const-wide/16 v14, 0x0

    .line 74
    .line 75
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v12

    .line 79
    invoke-virtual {v3}, Li41;->m()J

    .line 80
    .line 81
    .line 82
    move-result-wide v16

    .line 83
    sub-long v12, v16, v12

    .line 84
    .line 85
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v12

    .line 89
    if-eqz v7, :cond_2

    .line 90
    .line 91
    const/4 v3, -0x1

    .line 92
    if-ne v8, v3, :cond_2

    .line 93
    .line 94
    iget-object v3, v1, Lw12;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Lzt4;

    .line 97
    .line 98
    invoke-virtual {v4, v7, v3}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    iget-wide v3, v3, Lzt4;->e:J

    .line 103
    .line 104
    invoke-static {v3, v4}, Lf35;->i0(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    sub-long/2addr v10, v3

    .line 109
    :cond_2
    iget-object v3, v1, Lw12;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lvp4;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    iget-boolean v14, v0, Lzm4;->g:Z

    .line 121
    .line 122
    iget v15, v0, Lzm4;->a:I

    .line 123
    .line 124
    if-eqz v14, :cond_4

    .line 125
    .line 126
    iget-object v14, v0, Lzm4;->b:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-static {v7, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    if-eqz v14, :cond_4

    .line 133
    .line 134
    iget v14, v0, Lzm4;->c:I

    .line 135
    .line 136
    if-ne v8, v14, :cond_4

    .line 137
    .line 138
    iget v14, v0, Lzm4;->d:I

    .line 139
    .line 140
    if-ne v9, v14, :cond_4

    .line 141
    .line 142
    move-object/from16 v16, v7

    .line 143
    .line 144
    iget-wide v6, v0, Lzm4;->e:J

    .line 145
    .line 146
    cmp-long v6, v10, v6

    .line 147
    .line 148
    if-nez v6, :cond_5

    .line 149
    .line 150
    iget-wide v6, v0, Lzm4;->f:J

    .line 151
    .line 152
    cmp-long v6, v12, v6

    .line 153
    .line 154
    if-nez v6, :cond_5

    .line 155
    .line 156
    iget-wide v6, v0, Lzm4;->h:J

    .line 157
    .line 158
    sub-long/2addr v3, v6

    .line 159
    int-to-long v6, v15

    .line 160
    cmp-long v0, v3, v6

    .line 161
    .line 162
    if-ltz v0, :cond_3

    .line 163
    .line 164
    iget-object v0, v1, Lw12;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ld41;

    .line 167
    .line 168
    new-instance v1, Landroidx/media3/common/util/StuckPlayerException;

    .line 169
    .line 170
    invoke-direct {v1, v5, v15}, Landroidx/media3/common/util/StuckPlayerException;-><init>(II)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v0, Ld41;->n:Li41;

    .line 174
    .line 175
    new-instance v2, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 176
    .line 177
    const/16 v3, 0x3eb

    .line 178
    .line 179
    const/4 v14, 0x2

    .line 180
    invoke-direct {v2, v14, v1, v3}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v2}, Li41;->u1(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    .line 184
    .line 185
    .line 186
    :cond_3
    return-void

    .line 187
    :cond_4
    move-object/from16 v16, v7

    .line 188
    .line 189
    :cond_5
    iput-boolean v5, v0, Lzm4;->g:Z

    .line 190
    .line 191
    iput-wide v3, v0, Lzm4;->h:J

    .line 192
    .line 193
    move-object/from16 v7, v16

    .line 194
    .line 195
    iput-object v7, v0, Lzm4;->b:Ljava/lang/Object;

    .line 196
    .line 197
    iput v8, v0, Lzm4;->c:I

    .line 198
    .line 199
    iput v9, v0, Lzm4;->d:I

    .line 200
    .line 201
    iput-wide v10, v0, Lzm4;->e:J

    .line 202
    .line 203
    iput-wide v12, v0, Lzm4;->f:J

    .line 204
    .line 205
    invoke-virtual {v2, v5}, Lyp4;->f(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v5, v15}, Lyp4;->h(II)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_6
    :goto_1
    iget-boolean v1, v0, Lzm4;->g:Z

    .line 213
    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    invoke-virtual {v2, v5}, Lyp4;->f(I)V

    .line 217
    .line 218
    .line 219
    :cond_7
    const/4 v1, 0x0

    .line 220
    iput-boolean v1, v0, Lzm4;->g:Z

    .line 221
    .line 222
    return-void
.end method
