.class public final Ldefpackage/dn;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ldefpackage/fz0;

.field public final c:Ldefpackage/wo0;

.field public final d:Ldefpackage/zh0;

.field public e:Ldefpackage/tc2;

.field public f:Ldefpackage/vp4;

.field public g:Ldefpackage/nl;

.field public h:Ldefpackage/ql;

.field public i:Landroid/os/Looper;

.field public j:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ldefpackage/ss0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/dn;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v1, p1, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ldefpackage/wo0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Ldefpackage/dn;->c:Ldefpackage/wo0;

    .line 18
    .line 19
    iget-object v1, p1, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ldefpackage/fz0;

    .line 22
    .line 23
    iput-object v1, p0, Ldefpackage/dn;->b:Ldefpackage/fz0;

    .line 24
    .line 25
    iget-object p1, p1, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ldefpackage/nl;

    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/dn;->g:Ldefpackage/nl;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Ldefpackage/zh0;

    .line 36
    .line 37
    const/16 v0, 0x8

    .line 38
    .line 39
    invoke-direct {p1, v0, p0}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iput-object p1, p0, Ldefpackage/dn;->d:Ldefpackage/zh0;

    .line 43
    .line 44
    sget-object p1, Ldefpackage/vp4;->a:Ldefpackage/vp4;

    .line 45
    .line 46
    iput-object p1, p0, Ldefpackage/dn;->f:Ldefpackage/vp4;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/em;)Ldefpackage/an;
    .locals 8

    .line 1
    :try_start_0
    iget v0, p1, Ldefpackage/em;->h:I

    .line 2
    .line 3
    iget v1, p1, Ldefpackage/em;->i:I
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/16 v3, 0x22

    .line 7
    .line 8
    if-eq v1, v2, :cond_2

    .line 9
    .line 10
    iget-object v2, p0, Ldefpackage/dn;->a:Landroid/content/Context;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    :try_start_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    if-lt v4, v3, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/dn;->j:Landroid/content/Context;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Ldefpackage/bn;->c(Landroid/content/Context;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    :cond_0
    invoke-static {v2, v1}, Ldefpackage/bn;->e(Landroid/content/Context;I)Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Ldefpackage/dn;->j:Landroid/content/Context;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Ldefpackage/dn;->j:Landroid/content/Context;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    move v7, v1

    .line 38
    move-object v1, v0

    .line 39
    move v0, v7

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v1, 0x0

    .line 42
    :goto_0
    new-instance v2, Landroid/media/AudioFormat$Builder;

    .line 43
    .line 44
    invoke-direct {v2}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 45
    .line 46
    .line 47
    iget v4, p1, Ldefpackage/em;->b:I

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget v4, p1, Ldefpackage/em;->c:I

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget v4, p1, Ldefpackage/em;->a:I

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v4, p1, Ldefpackage/em;->g:Ldefpackage/il;

    .line 70
    .line 71
    iget-boolean v5, p1, Ldefpackage/em;->d:Z
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    :try_start_2
    new-instance v4, Landroid/media/AudioAttributes$Builder;

    .line 77
    .line 78
    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 79
    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const/16 v5, 0x10

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4, v6}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {v4}, Ldefpackage/il;->c()Landroid/media/AudioAttributes;

    .line 102
    .line 103
    .line 104
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 105
    :goto_1
    :try_start_3
    new-instance v5, Landroid/media/AudioTrack$Builder;

    .line 106
    .line 107
    invoke-direct {v5}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v4}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4, v2}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2, v6}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget v4, p1, Ldefpackage/em;->f:I

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2, v0}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 133
    .line 134
    const/16 v4, 0x1d

    .line 135
    .line 136
    if-lt v2, v4, :cond_4

    .line 137
    .line 138
    iget-boolean v4, p1, Ldefpackage/em;->e:Z

    .line 139
    .line 140
    invoke-static {v0, v4}, Ldefpackage/z9;->m(Landroid/media/AudioTrack$Builder;Z)V

    .line 141
    .line 142
    .line 143
    :cond_4
    if-lt v2, v3, :cond_5

    .line 144
    .line 145
    if-eqz v1, :cond_5

    .line 146
    .line 147
    invoke-static {v0, v1}, Ldefpackage/bn;->x(Landroid/media/AudioTrack$Builder;Landroid/content/Context;)V

    .line 148
    .line 149
    .line 150
    :cond_5
    invoke-virtual {v0}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2

    .line 154
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-ne v1, v6, :cond_6

    .line 159
    .line 160
    new-instance v1, Ldefpackage/an;

    .line 161
    .line 162
    iget-object v2, p0, Ldefpackage/dn;->d:Ldefpackage/zh0;

    .line 163
    .line 164
    iget-object p0, p0, Ldefpackage/dn;->f:Ldefpackage/vp4;

    .line 165
    .line 166
    invoke-direct {v1, v0, p1, v2, p0}, Ldefpackage/an;-><init>(Landroid/media/AudioTrack;Ldefpackage/em;Ldefpackage/zh0;Ldefpackage/vp4;)V

    .line 167
    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_6
    :try_start_4
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 171
    .line 172
    .line 173
    :catch_0
    new-instance p0, Landroidx/media3/exoplayer/audio/AudioOutputProvider$InitializationException;

    .line 174
    .line 175
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioOutputProvider$InitializationException;-><init>()V

    .line 176
    .line 177
    .line 178
    throw p0

    .line 179
    :catch_1
    move-exception p0

    .line 180
    goto :goto_2

    .line 181
    :catch_2
    move-exception p0

    .line 182
    :goto_2
    new-instance p1, Landroidx/media3/exoplayer/audio/AudioOutputProvider$InitializationException;

    .line 183
    .line 184
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    throw p1
.end method

.method public final b(Ldefpackage/am;)Ldefpackage/cm;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/dn;->e(Ldefpackage/am;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/am;->a:Ldefpackage/tb1;

    .line 5
    .line 6
    iget-object p1, p1, Ldefpackage/am;->b:Ldefpackage/il;

    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/dn;->c:Ldefpackage/wo0;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p1}, Ldefpackage/wo0;->v(Ldefpackage/tb1;Ldefpackage/il;)Ldefpackage/zl;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ldefpackage/bm;

    .line 15
    .line 16
    invoke-direct {v2}, Ldefpackage/bm;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v0, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 20
    .line 21
    iget v4, v0, Ldefpackage/tb1;->H:I

    .line 22
    .line 23
    const-string v5, "audio/raw"

    .line 24
    .line 25
    invoke-static {v3, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x2

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    if-ne v4, v6, :cond_1

    .line 34
    .line 35
    :goto_0
    move v5, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object p0, p0, Ldefpackage/dn;->g:Ldefpackage/nl;

    .line 38
    .line 39
    invoke-virtual {p0, v0, p1}, Ldefpackage/nl;->d(Ldefpackage/tb1;Ldefpackage/il;)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    iput v5, v2, Ldefpackage/bm;->a:I

    .line 47
    .line 48
    iget-boolean p0, v1, Ldefpackage/zl;->a:Z

    .line 49
    .line 50
    iput-boolean p0, v2, Ldefpackage/bm;->b:Z

    .line 51
    .line 52
    iget-boolean p0, v1, Ldefpackage/zl;->b:Z

    .line 53
    .line 54
    iput-boolean p0, v2, Ldefpackage/bm;->c:Z

    .line 55
    .line 56
    iget-boolean p0, v1, Ldefpackage/zl;->c:Z

    .line 57
    .line 58
    iput-boolean p0, v2, Ldefpackage/bm;->d:Z

    .line 59
    .line 60
    invoke-virtual {v2}, Ldefpackage/bm;->a()Ldefpackage/cm;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public final c(Ldefpackage/am;)Ldefpackage/em;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/am;->a:Ldefpackage/tb1;

    .line 6
    .line 7
    iget-boolean v3, v1, Ldefpackage/am;->d:Z

    .line 8
    .line 9
    iget-object v4, v1, Ldefpackage/am;->b:Ldefpackage/il;

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p1}, Ldefpackage/dn;->e(Ldefpackage/am;)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 15
    .line 16
    iget v6, v2, Ldefpackage/tb1;->G:I

    .line 17
    .line 18
    iget v7, v2, Ldefpackage/tb1;->H:I

    .line 19
    .line 20
    iget v8, v2, Ldefpackage/tb1;->F:I

    .line 21
    .line 22
    const-string v9, "audio/raw"

    .line 23
    .line 24
    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    const/4 v10, 0x2

    .line 29
    const/4 v11, -0x1

    .line 30
    const/4 v12, 0x1

    .line 31
    if-eqz v9, :cond_0

    .line 32
    .line 33
    invoke-static {v7}, Ldefpackage/f35;->L(I)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v3}, Ldefpackage/rr2;->l(Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {v8}, Ldefpackage/f35;->s(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v7}, Ldefpackage/f35;->t(I)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    mul-int/2addr v9, v8

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    :goto_0
    const/4 v15, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_0
    if-eqz v3, :cond_1

    .line 54
    .line 55
    iget-object v7, v0, Ldefpackage/dn;->c:Ldefpackage/wo0;

    .line 56
    .line 57
    invoke-virtual {v7, v2, v4}, Ldefpackage/wo0;->v(Ldefpackage/tb1;Ldefpackage/il;)Ldefpackage/zl;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    sget-object v7, Ldefpackage/zl;->d:Ldefpackage/zl;

    .line 63
    .line 64
    :goto_1
    if-eqz v3, :cond_2

    .line 65
    .line 66
    iget-boolean v3, v7, Ldefpackage/zl;->a:Z

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v3, v2, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v5, v3}, Ldefpackage/lw2;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-static {v8}, Ldefpackage/f35;->s(I)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    iget-boolean v7, v7, Ldefpackage/zl;->b:Z

    .line 84
    .line 85
    move v9, v7

    .line 86
    move v7, v3

    .line 87
    move v3, v8

    .line 88
    move v8, v9

    .line 89
    move v9, v11

    .line 90
    move v14, v12

    .line 91
    move v15, v14

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object v3, v0, Ldefpackage/dn;->g:Ldefpackage/nl;

    .line 94
    .line 95
    invoke-virtual {v3, v2, v4}, Ldefpackage/nl;->d(Ldefpackage/tb1;Ldefpackage/il;)Landroid/util/Pair;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-eqz v3, :cond_11

    .line 100
    .line 101
    iget-object v7, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v7, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    move v14, v10

    .line 118
    move v9, v11

    .line 119
    const/4 v8, 0x0

    .line 120
    goto :goto_0

    .line 121
    :goto_2
    iget v2, v2, Ldefpackage/tb1;->j:I

    .line 122
    .line 123
    const-string v13, "audio/vnd.dts.hd;profile=lbr"

    .line 124
    .line 125
    invoke-static {v5, v13}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_3

    .line 130
    .line 131
    if-ne v2, v11, :cond_3

    .line 132
    .line 133
    const v2, 0xbb800

    .line 134
    .line 135
    .line 136
    :cond_3
    iget v5, v1, Ldefpackage/am;->h:I

    .line 137
    .line 138
    if-eq v5, v11, :cond_4

    .line 139
    .line 140
    move/from16 v20, v12

    .line 141
    .line 142
    goto/16 :goto_c

    .line 143
    .line 144
    :cond_4
    invoke-static {v6, v3, v7}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    const/4 v13, -0x2

    .line 149
    if-eq v5, v13, :cond_5

    .line 150
    .line 151
    move v13, v12

    .line 152
    goto :goto_3

    .line 153
    :cond_5
    const/4 v13, 0x0

    .line 154
    :goto_3
    invoke-static {v13}, Ldefpackage/rr2;->w(Z)V

    .line 155
    .line 156
    .line 157
    if-eq v9, v11, :cond_6

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    move v9, v12

    .line 161
    :goto_4
    if-eqz v15, :cond_7

    .line 162
    .line 163
    const-wide/high16 v16, 0x4020000000000000L    # 8.0

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 167
    .line 168
    :goto_5
    iget-object v0, v0, Ldefpackage/dn;->b:Ldefpackage/fz0;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const-wide/32 v18, 0xf4240

    .line 174
    .line 175
    .line 176
    if-eqz v14, :cond_f

    .line 177
    .line 178
    const v0, -0x7fffffff

    .line 179
    .line 180
    .line 181
    if-eq v14, v12, :cond_d

    .line 182
    .line 183
    if-ne v14, v10, :cond_c

    .line 184
    .line 185
    const/4 v10, 0x5

    .line 186
    const/16 v13, 0x8

    .line 187
    .line 188
    if-ne v7, v10, :cond_8

    .line 189
    .line 190
    const v10, 0x7a120

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    if-ne v7, v13, :cond_9

    .line 195
    .line 196
    const v10, 0xf4240

    .line 197
    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_9
    const v10, 0x3d090

    .line 201
    .line 202
    .line 203
    :goto_6
    if-eq v2, v11, :cond_a

    .line 204
    .line 205
    sget-object v0, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 206
    .line 207
    invoke-static {v2, v13}, Ldefpackage/h12;->m(II)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    :goto_7
    move/from16 v20, v12

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_a
    invoke-static {v7}, Ldefpackage/wr1;->w(I)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eq v2, v0, :cond_b

    .line 219
    .line 220
    move v0, v12

    .line 221
    goto :goto_8

    .line 222
    :cond_b
    const/4 v0, 0x0

    .line 223
    :goto_8
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 224
    .line 225
    .line 226
    move v0, v2

    .line 227
    goto :goto_7

    .line 228
    :goto_9
    int-to-long v12, v10

    .line 229
    move-wide/from16 v21, v12

    .line 230
    .line 231
    int-to-long v11, v0

    .line 232
    mul-long v12, v21, v11

    .line 233
    .line 234
    div-long v12, v12, v18

    .line 235
    .line 236
    invoke-static {v12, v13}, Ldefpackage/jz4;->m(J)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    goto :goto_b

    .line 241
    :cond_c
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 242
    .line 243
    .line 244
    const/4 v0, 0x0

    .line 245
    return-object v0

    .line 246
    :cond_d
    move/from16 v20, v12

    .line 247
    .line 248
    invoke-static {v7}, Ldefpackage/wr1;->w(I)I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eq v2, v0, :cond_e

    .line 253
    .line 254
    move/from16 v0, v20

    .line 255
    .line 256
    goto :goto_a

    .line 257
    :cond_e
    const/4 v0, 0x0

    .line 258
    :goto_a
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 259
    .line 260
    .line 261
    const-wide/32 v21, 0x2faf080

    .line 262
    .line 263
    .line 264
    int-to-long v10, v2

    .line 265
    mul-long v11, v21, v10

    .line 266
    .line 267
    div-long v11, v11, v18

    .line 268
    .line 269
    invoke-static {v11, v12}, Ldefpackage/jz4;->m(J)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    goto :goto_b

    .line 274
    :cond_f
    move/from16 v20, v12

    .line 275
    .line 276
    mul-int/lit8 v0, v5, 0x4

    .line 277
    .line 278
    int-to-long v10, v6

    .line 279
    const-wide/32 v12, 0x3d090

    .line 280
    .line 281
    .line 282
    mul-long/2addr v12, v10

    .line 283
    move-wide/from16 v21, v10

    .line 284
    .line 285
    int-to-long v10, v9

    .line 286
    mul-long/2addr v12, v10

    .line 287
    div-long v12, v12, v18

    .line 288
    .line 289
    invoke-static {v12, v13}, Ldefpackage/jz4;->m(J)I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    const-wide/32 v12, 0xb71b0

    .line 294
    .line 295
    .line 296
    mul-long v12, v12, v21

    .line 297
    .line 298
    mul-long/2addr v12, v10

    .line 299
    div-long v12, v12, v18

    .line 300
    .line 301
    invoke-static {v12, v13}, Ldefpackage/jz4;->m(J)I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    invoke-static {v0, v2, v10}, Ldefpackage/f35;->j(III)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    :goto_b
    int-to-double v10, v0

    .line 310
    mul-double v10, v10, v16

    .line 311
    .line 312
    double-to-int v0, v10

    .line 313
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    add-int/2addr v0, v9

    .line 318
    add-int/lit8 v0, v0, -0x1

    .line 319
    .line 320
    div-int/2addr v0, v9

    .line 321
    mul-int v5, v0, v9

    .line 322
    .line 323
    :goto_c
    new-instance v0, Ldefpackage/dm;

    .line 324
    .line 325
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 326
    .line 327
    .line 328
    sget-object v2, Ldefpackage/il;->i:Ldefpackage/il;

    .line 329
    .line 330
    const/4 v10, -0x1

    .line 331
    iput v10, v0, Ldefpackage/dm;->i:I

    .line 332
    .line 333
    iput v6, v0, Ldefpackage/dm;->b:I

    .line 334
    .line 335
    iput v3, v0, Ldefpackage/dm;->c:I

    .line 336
    .line 337
    iput v7, v0, Ldefpackage/dm;->a:I

    .line 338
    .line 339
    iput v5, v0, Ldefpackage/dm;->f:I

    .line 340
    .line 341
    iget v2, v1, Ldefpackage/am;->e:I

    .line 342
    .line 343
    iput v2, v0, Ldefpackage/dm;->h:I

    .line 344
    .line 345
    iput-object v4, v0, Ldefpackage/dm;->g:Ldefpackage/il;

    .line 346
    .line 347
    move/from16 v2, v20

    .line 348
    .line 349
    if-ne v14, v2, :cond_10

    .line 350
    .line 351
    move v12, v2

    .line 352
    goto :goto_d

    .line 353
    :cond_10
    const/4 v12, 0x0

    .line 354
    :goto_d
    iput-boolean v12, v0, Ldefpackage/dm;->e:Z

    .line 355
    .line 356
    iget-boolean v2, v1, Ldefpackage/am;->g:Z

    .line 357
    .line 358
    iput-boolean v2, v0, Ldefpackage/dm;->d:Z

    .line 359
    .line 360
    iput-boolean v15, v0, Ldefpackage/dm;->j:Z

    .line 361
    .line 362
    iput-boolean v8, v0, Ldefpackage/dm;->k:Z

    .line 363
    .line 364
    iget v1, v1, Ldefpackage/am;->f:I

    .line 365
    .line 366
    iput v1, v0, Ldefpackage/dm;->i:I

    .line 367
    .line 368
    new-instance v1, Ldefpackage/em;

    .line 369
    .line 370
    invoke-direct {v1, v0}, Ldefpackage/em;-><init>(Ldefpackage/dm;)V

    .line 371
    .line 372
    .line 373
    return-object v1

    .line 374
    :cond_11
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioOutputProvider$ConfigurationException;

    .line 375
    .line 376
    new-instance v1, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    const-string v3, "Unable to configure passthrough for: "

    .line 379
    .line 380
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v0
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/dn;->e:Ldefpackage/tc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/tc2;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/dn;->h:Ldefpackage/ql;

    .line 9
    .line 10
    if-eqz p0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/ql;->a:Landroid/content/Context;

    .line 13
    .line 14
    iget-boolean v1, p0, Ldefpackage/ql;->j:Z

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Ldefpackage/ql;->g:Ldefpackage/nl;

    .line 21
    .line 22
    invoke-static {v0}, Ldefpackage/xl;->n(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Ldefpackage/ql;->d:Ldefpackage/ol;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ldefpackage/ql;->e:Ldefpackage/v9;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ldefpackage/ql;->f:Ldefpackage/pl;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v1, v0, Ldefpackage/pl;->a:Landroid/content/ContentResolver;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Ldefpackage/ql;->j:Z

    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void
.end method

.method public final e(Ldefpackage/am;)V
    .locals 5

    .line 1
    iget-object v0, p1, Ldefpackage/am;->c:Landroid/media/AudioDeviceInfo;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/am;->b:Ldefpackage/il;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/dn;->f()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/dn;->h:Ldefpackage/ql;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v2, p0, Ldefpackage/dn;->a:Landroid/content/Context;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    new-instance v1, Ldefpackage/ql;

    .line 17
    .line 18
    new-instance v3, Ldefpackage/cn;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v3, v4, p0}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, v3, p1, v0}, Ldefpackage/ql;-><init>(Landroid/content/Context;Ldefpackage/cn;Ldefpackage/il;Landroid/media/AudioDeviceInfo;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Ldefpackage/dn;->h:Ldefpackage/ql;

    .line 28
    .line 29
    iget-boolean p1, v1, Ldefpackage/ql;->j:Z

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, v1, Ldefpackage/ql;->g:Ldefpackage/nl;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, v1, Ldefpackage/ql;->j:Z

    .line 41
    .line 42
    iget-object p1, v1, Ldefpackage/ql;->f:Ldefpackage/pl;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object v0, p1, Ldefpackage/pl;->a:Landroid/content/ContentResolver;

    .line 47
    .line 48
    iget-object v2, p1, Ldefpackage/pl;->b:Landroid/net/Uri;

    .line 49
    .line 50
    invoke-virtual {v0, v2, v4, p1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object p1, v1, Ldefpackage/ql;->a:Landroid/content/Context;

    .line 54
    .line 55
    invoke-static {p1}, Ldefpackage/xl;->n(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v2, v1, Ldefpackage/ql;->d:Ldefpackage/ol;

    .line 60
    .line 61
    iget-object v3, v1, Ldefpackage/ql;->c:Landroid/os/Handler;

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Landroid/content/IntentFilter;

    .line 67
    .line 68
    const-string v2, "android.media.action.HDMI_AUDIO_PLUG"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    iget-object v4, v1, Ldefpackage/ql;->e:Ldefpackage/v9;

    .line 75
    .line 76
    invoke-virtual {p1, v4, v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v2, v1, Ldefpackage/ql;->i:Ldefpackage/il;

    .line 81
    .line 82
    iget-object v3, v1, Ldefpackage/ql;->h:Landroid/media/AudioDeviceInfo;

    .line 83
    .line 84
    invoke-static {p1, v0, v2, v3}, Ldefpackage/nl;->c(Landroid/content/Context;Landroid/content/Intent;Ldefpackage/il;Landroid/media/AudioDeviceInfo;)Ldefpackage/nl;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, v1, Ldefpackage/ql;->g:Ldefpackage/nl;

    .line 89
    .line 90
    :goto_0
    iput-object p1, p0, Ldefpackage/dn;->g:Ldefpackage/nl;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    if-eqz v1, :cond_6

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    iget-object v2, v1, Ldefpackage/ql;->h:Landroid/media/AudioDeviceInfo;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    iput-object v0, v1, Ldefpackage/ql;->h:Landroid/media/AudioDeviceInfo;

    .line 107
    .line 108
    iget-object v2, v1, Ldefpackage/ql;->a:Landroid/content/Context;

    .line 109
    .line 110
    iget-object v3, v1, Ldefpackage/ql;->i:Ldefpackage/il;

    .line 111
    .line 112
    invoke-static {v2, v3, v0}, Ldefpackage/nl;->b(Landroid/content/Context;Ldefpackage/il;Landroid/media/AudioDeviceInfo;)Ldefpackage/nl;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v1, v0}, Ldefpackage/ql;->a(Ldefpackage/nl;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    :goto_1
    iget-object v0, p0, Ldefpackage/dn;->h:Ldefpackage/ql;

    .line 120
    .line 121
    iget-object v1, v0, Ldefpackage/ql;->i:Ldefpackage/il;

    .line 122
    .line 123
    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    iput-object p1, v0, Ldefpackage/ql;->i:Ldefpackage/il;

    .line 131
    .line 132
    iget-object v1, v0, Ldefpackage/ql;->a:Landroid/content/Context;

    .line 133
    .line 134
    iget-object v2, v0, Ldefpackage/ql;->h:Landroid/media/AudioDeviceInfo;

    .line 135
    .line 136
    invoke-static {v1, p1, v2}, Ldefpackage/nl;->b(Landroid/content/Context;Ldefpackage/il;Landroid/media/AudioDeviceInfo;)Ldefpackage/nl;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v0, p1}, Ldefpackage/ql;->a(Ldefpackage/nl;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    :goto_2
    iget-object p0, p0, Ldefpackage/dn;->g:Ldefpackage/nl;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/dn;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ldefpackage/dn;->i:Landroid/os/Looper;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-ne v1, v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_2
    :goto_0
    const/4 v2, 0x1

    .line 20
    :goto_1
    const-string v3, "null"

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    move-object v1, v3

    .line 25
    goto :goto_2

    .line 26
    :cond_3
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_2
    if-nez v0, :cond_4

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_4
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :goto_3
    if-eqz v2, :cond_5

    .line 46
    .line 47
    iput-object v0, p0, Ldefpackage/dn;->i:Landroid/os/Looper;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_5
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v0, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s"

    .line 55
    .line 56
    invoke-static {v0, p0}, Ldefpackage/gh0;->s(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
