.class public final Liz3;
.super Lfp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public volatile i:F

.field public volatile j:F

.field public volatile k:F

.field public volatile l:Z

.field public m:F

.field public n:F

.field public o:F

.field public p:I

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z


# virtual methods
.method public final a(Lgm;)Lgm;
    .locals 2

    .line 1
    iget v0, p1, Lgm;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lgm;->e:Lgm;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget v0, p1, Lgm;->a:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    const v1, 0x3c23d70a    # 0.01f

    .line 16
    .line 17
    .line 18
    mul-float/2addr v0, v1

    .line 19
    float-to-int v0, v0

    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Liz3;->p:I

    .line 26
    .line 27
    iget-boolean v0, p0, Liz3;->t:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iput-boolean v1, p0, Liz3;->u:Z

    .line 32
    .line 33
    :cond_1
    return-object p1
.end method

.method public final e(Ljava/nio/ByteBuffer;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Liz3;->s:Z

    .line 10
    .line 11
    iget v2, p0, Liz3;->i:F

    .line 12
    .line 13
    iget-boolean v3, p0, Liz3;->r:Z

    .line 14
    .line 15
    const v4, 0x38d1b717    # 1.0E-4f

    .line 16
    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    iget v3, p0, Liz3;->m:F

    .line 21
    .line 22
    sub-float v3, v2, v3

    .line 23
    .line 24
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    cmpl-float v3, v3, v4

    .line 29
    .line 30
    if-lez v3, :cond_1

    .line 31
    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v5, "queueInput: RAMP START active="

    .line 35
    .line 36
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget v5, p0, Liz3;->m:F

    .line 40
    .line 41
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v5, " -> target="

    .line 45
    .line 46
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v5, "RGAudioProcessor"

    .line 57
    .line 58
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    iget v3, p0, Liz3;->m:F

    .line 62
    .line 63
    iput v3, p0, Liz3;->n:F

    .line 64
    .line 65
    iput v2, p0, Liz3;->o:F

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    iput v2, p0, Liz3;->q:I

    .line 69
    .line 70
    iput-boolean v1, p0, Liz3;->r:Z

    .line 71
    .line 72
    :cond_1
    iget-boolean v1, p0, Liz3;->r:Z

    .line 73
    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    iget v1, p0, Liz3;->m:F

    .line 77
    .line 78
    const/high16 v2, 0x3f800000    # 1.0f

    .line 79
    .line 80
    sub-float/2addr v1, v2

    .line 81
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    cmpg-float v1, v1, v4

    .line 86
    .line 87
    if-gez v1, :cond_2

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    invoke-virtual {p0, v0}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lfp;->b:Lgm;

    .line 112
    .line 113
    iget v1, v1, Lgm;->c:I

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    if-ne v1, v2, :cond_5

    .line 117
    .line 118
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-lt v1, v2, :cond_6

    .line 123
    .line 124
    invoke-virtual {p0}, Liz3;->m()F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    int-to-float v3, v3

    .line 133
    mul-float/2addr v3, v1

    .line 134
    const v1, 0x46fffe00    # 32767.0f

    .line 135
    .line 136
    .line 137
    cmpl-float v4, v3, v1

    .line 138
    .line 139
    if-lez v4, :cond_3

    .line 140
    .line 141
    :goto_1
    move v3, v1

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    const/high16 v1, -0x39000000    # -32768.0f

    .line 144
    .line 145
    cmpg-float v4, v3, v1

    .line 146
    .line 147
    if-gez v4, :cond_4

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_4
    :goto_2
    float-to-int v1, v3

    .line 151
    int-to-short v1, v1

    .line 152
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_5
    :goto_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    const/4 v2, 0x4

    .line 161
    if-lt v1, v2, :cond_6

    .line 162
    .line 163
    invoke-virtual {p0}, Liz3;->m()F

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    mul-float/2addr v2, v1

    .line 172
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Liz3;->l:Z

    .line 2
    .line 3
    const-string v1, "RGAudioProcessor"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Liz3;->s:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Liz3;->t:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Liz3;->u:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v0, p0, Liz3;->j:F

    .line 21
    .line 22
    iput v0, p0, Liz3;->m:F

    .line 23
    .line 24
    iget v0, p0, Liz3;->j:F

    .line 25
    .line 26
    iput v0, p0, Liz3;->i:F

    .line 27
    .line 28
    iput-boolean v2, p0, Liz3;->l:Z

    .line 29
    .line 30
    iput-boolean v2, p0, Liz3;->r:Z

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, "onFlush: GAPLESS PROMOTION -> active/target="

    .line 35
    .line 36
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget v3, p0, Liz3;->m:F

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-boolean v0, p0, Liz3;->l:Z

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-boolean v0, p0, Liz3;->s:Z

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-boolean v0, p0, Liz3;->t:Z

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget v0, p0, Liz3;->j:F

    .line 65
    .line 66
    iput v0, p0, Liz3;->m:F

    .line 67
    .line 68
    iget v0, p0, Liz3;->j:F

    .line 69
    .line 70
    iput v0, p0, Liz3;->i:F

    .line 71
    .line 72
    iget v0, p0, Liz3;->j:F

    .line 73
    .line 74
    iput v0, p0, Liz3;->k:F

    .line 75
    .line 76
    iput-boolean v2, p0, Liz3;->l:Z

    .line 77
    .line 78
    iput-boolean v2, p0, Liz3;->r:Z

    .line 79
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "onFlush: SAME-FORMAT GAPLESS PROMOTION -> active/target/baseline="

    .line 83
    .line 84
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget v3, p0, Liz3;->m:F

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v3, "onFlush: SEEK/STARTUP branch, restoring to baseline="

    .line 103
    .line 104
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget v3, p0, Liz3;->k:F

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v3, " (was active="

    .line 113
    .line 114
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget v3, p0, Liz3;->m:F

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v3, ")"

    .line 123
    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    iget v0, p0, Liz3;->k:F

    .line 135
    .line 136
    iput v0, p0, Liz3;->m:F

    .line 137
    .line 138
    iget v0, p0, Liz3;->k:F

    .line 139
    .line 140
    iput v0, p0, Liz3;->i:F

    .line 141
    .line 142
    iput-boolean v2, p0, Liz3;->r:Z

    .line 143
    .line 144
    iput-boolean v2, p0, Liz3;->l:Z

    .line 145
    .line 146
    :goto_0
    iput-boolean v2, p0, Liz3;->t:Z

    .line 147
    .line 148
    iput-boolean v2, p0, Liz3;->s:Z

    .line 149
    .line 150
    iput-boolean v2, p0, Liz3;->u:Z

    .line 151
    .line 152
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Liz3;->t:Z

    .line 3
    .line 4
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget v0, p0, Liz3;->k:F

    .line 2
    .line 3
    iput v0, p0, Liz3;->m:F

    .line 4
    .line 5
    iget v0, p0, Liz3;->k:F

    .line 6
    .line 7
    iput v0, p0, Liz3;->i:F

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput v0, p0, Liz3;->j:F

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Liz3;->l:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Liz3;->t:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Liz3;->u:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Liz3;->r:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Liz3;->s:Z

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, "onReset: gain reset to baseline="

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget p0, p0, Liz3;->k:F

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "RGAudioProcessor"

    .line 41
    .line 42
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final m()F
    .locals 5

    .line 1
    iget-boolean v0, p0, Liz3;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Liz3;->m:F

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget v0, p0, Liz3;->q:I

    .line 9
    .line 10
    int-to-float v1, v0

    .line 11
    iget v2, p0, Liz3;->p:I

    .line 12
    .line 13
    int-to-float v3, v2

    .line 14
    div-float/2addr v1, v3

    .line 15
    iget v3, p0, Liz3;->n:F

    .line 16
    .line 17
    iget v4, p0, Liz3;->o:F

    .line 18
    .line 19
    invoke-static {v4, v3, v1, v3}, Lxa3;->a(FFFF)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Liz3;->q:I

    .line 26
    .line 27
    if-lt v0, v2, :cond_1

    .line 28
    .line 29
    iput v4, p0, Liz3;->m:F

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Liz3;->r:Z

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "advanceGain: RAMP COMPLETE -> active="

    .line 37
    .line 38
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget p0, p0, Liz3;->m:F

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "RGAudioProcessor"

    .line 51
    .line 52
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_1
    return v1
.end method

.method public final n(F)V
    .locals 4

    .line 1
    const/high16 v0, 0x41700000    # 15.0f

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, -0x3d900000    # -60.0f

    .line 8
    .line 9
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-double v0, v0

    .line 14
    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    .line 15
    .line 16
    div-double/2addr v0, v2

    .line 17
    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    .line 18
    .line 19
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    double-to-float v0, v0

    .line 24
    iput v0, p0, Liz3;->i:F

    .line 25
    .line 26
    iput v0, p0, Liz3;->k:F

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, p0, Liz3;->l:Z

    .line 30
    .line 31
    new-instance p0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "setGainImmediate: "

    .line 34
    .line 35
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, " dB -> linear="

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "RGAudioProcessor"

    .line 54
    .line 55
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    return-void
.end method
