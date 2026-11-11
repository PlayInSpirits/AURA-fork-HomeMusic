.class public final Lys4;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lu62;
.implements Lrv0;
.implements Lg94;


# instance fields
.field public B:Ljava/lang/String;

.field public C:Lzs4;

.field public D:Lha1;

.field public E:I

.field public F:Z

.field public G:I

.field public H:I

.field public I:Ljava/util/HashMap;

.field public J:Lrd3;

.field public K:Lws4;

.field public L:Lxs4;


# virtual methods
.method public final S(Le72;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lys4;->L:Lxs4;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Lxs4;->c:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, v0, Lxs4;->d:Lrd3;

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    :cond_2
    invoke-virtual {p0}, Lys4;->q0()Lrd3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_3
    iget-object v1, v0, Lrd3;->j:Lic;

    .line 28
    .line 29
    if-eqz v1, :cond_d

    .line 30
    .line 31
    iget-object p1, p1, Le72;->n:Lmz;

    .line 32
    .line 33
    iget-object p1, p1, Lmz;->o:Li61;

    .line 34
    .line 35
    invoke-virtual {p1}, Li61;->g()Ljz;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-boolean p1, v0, Lrd3;->k:Z

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-wide v3, v0, Lrd3;->l:J

    .line 44
    .line 45
    const/16 v0, 0x20

    .line 46
    .line 47
    shr-long v5, v3, v0

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    int-to-float v0, v0

    .line 51
    const-wide v5, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v3, v5

    .line 57
    long-to-int v3, v3

    .line 58
    int-to-float v3, v3

    .line 59
    invoke-interface {v2}, Ljz;->e()V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-interface {v2, v4, v4, v0, v3}, Ljz;->m(FFFF)V

    .line 64
    .line 65
    .line 66
    :cond_4
    :try_start_0
    iget-object p0, p0, Lys4;->C:Lzs4;

    .line 67
    .line 68
    iget-object v0, p0, Lzs4;->a:Lij4;

    .line 69
    .line 70
    iget-object p0, p0, Lzs4;->a:Lij4;

    .line 71
    .line 72
    iget-object v3, v0, Lij4;->m:Lsr4;

    .line 73
    .line 74
    if-nez v3, :cond_5

    .line 75
    .line 76
    sget-object v3, Lsr4;->b:Lsr4;

    .line 77
    .line 78
    :cond_5
    move-object v6, v3

    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    goto :goto_5

    .line 83
    :goto_1
    iget-object v3, v0, Lij4;->n:Lxb4;

    .line 84
    .line 85
    if-nez v3, :cond_6

    .line 86
    .line 87
    sget-object v3, Lxb4;->d:Lxb4;

    .line 88
    .line 89
    :cond_6
    move-object v5, v3

    .line 90
    iget-object v3, v0, Lij4;->o:Lq05;

    .line 91
    .line 92
    if-nez v3, :cond_7

    .line 93
    .line 94
    sget-object v3, Lc71;->d:Lc71;

    .line 95
    .line 96
    :cond_7
    move-object v7, v3

    .line 97
    iget-object v0, v0, Lij4;->a:Las4;

    .line 98
    .line 99
    invoke-interface {v0}, Las4;->f()Luo;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-eqz v3, :cond_8

    .line 104
    .line 105
    iget-object p0, p0, Lij4;->a:Las4;

    .line 106
    .line 107
    invoke-interface {p0}, Las4;->b()F

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual/range {v1 .. v7}, Lic;->e(Ljz;Luo;FLxb4;Lsr4;Lq05;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    sget-wide v3, Lx40;->g:J

    .line 116
    .line 117
    const-wide/16 v8, 0x10

    .line 118
    .line 119
    cmp-long v0, v3, v8

    .line 120
    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_9
    iget-object v0, p0, Lij4;->a:Las4;

    .line 125
    .line 126
    invoke-interface {v0}, Las4;->c()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    cmp-long v0, v3, v8

    .line 131
    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    iget-object p0, p0, Lij4;->a:Las4;

    .line 135
    .line 136
    invoke-interface {p0}, Las4;->c()J

    .line 137
    .line 138
    .line 139
    move-result-wide v3

    .line 140
    goto :goto_2

    .line 141
    :cond_a
    sget-wide v3, Lx40;->b:J

    .line 142
    .line 143
    :goto_2
    invoke-virtual/range {v1 .. v7}, Lic;->d(Ljz;JLxb4;Lsr4;Lq05;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    :goto_3
    if-eqz p1, :cond_b

    .line 147
    .line 148
    invoke-interface {v2}, Ljz;->k()V

    .line 149
    .line 150
    .line 151
    :cond_b
    :goto_4
    return-void

    .line 152
    :goto_5
    if-eqz p1, :cond_c

    .line 153
    .line 154
    invoke-interface {v2}, Ljz;->k()V

    .line 155
    .line 156
    .line 157
    :cond_c
    throw p0

    .line 158
    :cond_d
    iget-object p1, p0, Lys4;->J:Lrd3;

    .line 159
    .line 160
    iget-object p0, p0, Lys4;->L:Lxs4;

    .line 161
    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v1, "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="

    .line 165
    .line 166
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string p1, ", textSubstitution="

    .line 173
    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string p0, ")"

    .line 181
    .line 182
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Lfz1;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Ler1;->a()V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public final c0(Lq94;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lys4;->K:Lws4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lws4;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lws4;-><init>(Lys4;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lys4;->K:Lws4;

    .line 12
    .line 13
    :cond_0
    new-instance v1, Lhe;

    .line 14
    .line 15
    iget-object v2, p0, Lys4;->B:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lhe;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lo94;->a:[Lc42;

    .line 21
    .line 22
    sget-object v2, Ln94;->z:Lp94;

    .line 23
    .line 24
    invoke-static {v1}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v2, v1}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lys4;->L:Lxs4;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-boolean v2, v1, Lxs4;->c:Z

    .line 36
    .line 37
    sget-object v3, Ln94;->B:Lp94;

    .line 38
    .line 39
    sget-object v4, Lo94;->a:[Lc42;

    .line 40
    .line 41
    const/16 v5, 0x11

    .line 42
    .line 43
    aget-object v5, v4, v5

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v3, v2}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lhe;

    .line 56
    .line 57
    iget-object v1, v1, Lxs4;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {v2, v1}, Lhe;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Ln94;->A:Lp94;

    .line 63
    .line 64
    const/16 v3, 0x10

    .line 65
    .line 66
    aget-object v3, v4, v3

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v1, v2}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    new-instance v1, Lws4;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-direct {v1, p0, v2}, Lws4;-><init>(Lys4;I)V

    .line 78
    .line 79
    .line 80
    sget-object v2, Ld94;->l:Lp94;

    .line 81
    .line 82
    new-instance v3, Lw2;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-direct {v3, v4, v1}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v2, v3}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lws4;

    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    invoke-direct {v1, p0, v2}, Lws4;-><init>(Lys4;I)V

    .line 95
    .line 96
    .line 97
    sget-object v2, Ld94;->m:Lp94;

    .line 98
    .line 99
    new-instance v3, Lw2;

    .line 100
    .line 101
    invoke-direct {v3, v4, v1}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v2, v3}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Lwc;

    .line 108
    .line 109
    const/16 v2, 0x1d

    .line 110
    .line 111
    invoke-direct {v1, v2, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Ld94;->n:Lp94;

    .line 115
    .line 116
    new-instance v2, Lw2;

    .line 117
    .line 118
    invoke-direct {v2, v4, v1}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, p0, v2}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, Ld94;->a:Lp94;

    .line 125
    .line 126
    new-instance v1, Lw2;

    .line 127
    .line 128
    invoke-direct {v1, v4, v0}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1, p0, v1}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0()Lrd3;
    .locals 8

    .line 1
    iget-object v2, p0, Lys4;->C:Lzs4;

    .line 2
    .line 3
    iget-object v0, p0, Lys4;->J:Lrd3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lrd3;

    .line 8
    .line 9
    iget-object v1, p0, Lys4;->B:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lys4;->D:Lha1;

    .line 12
    .line 13
    iget v4, p0, Lys4;->E:I

    .line 14
    .line 15
    iget-boolean v5, p0, Lys4;->F:Z

    .line 16
    .line 17
    iget v6, p0, Lys4;->G:I

    .line 18
    .line 19
    iget v7, p0, Lys4;->H:I

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Lrd3;-><init>(Ljava/lang/String;Lzs4;Lha1;IZII)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lys4;->J:Lrd3;

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lys4;->J:Lrd3;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public final r(Lcf2;Lpi2;J)Lvi2;
    .locals 8

    .line 1
    const-string v0, "TextStringSimpleNode::measure"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lys4;->L:Lxs4;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-boolean v1, v0, Lxs4;->c:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lxs4;->d:Lrd3;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Lys4;->q0()Lrd3;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_2
    invoke-virtual {v0, p1}, Lrd3;->c(Loo0;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lwi2;->getLayoutDirection()Lr62;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, p3, p4, v1}, Lrd3;->a(JLr62;)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    iget-object p4, v0, Lrd3;->n:Lqd3;

    .line 38
    .line 39
    if-eqz p4, :cond_3

    .line 40
    .line 41
    invoke-interface {p4}, Lqd3;->a()Z

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p4, v0, Lrd3;->j:Lic;

    .line 45
    .line 46
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p4, p4, Lic;->d:Lks4;

    .line 50
    .line 51
    iget-wide v0, v0, Lrd3;->l:J

    .line 52
    .line 53
    if-eqz p3, :cond_5

    .line 54
    .line 55
    const/4 p3, 0x2

    .line 56
    invoke-static {p0, p3}, Lj51;->M(Leo0;I)Lf63;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lf63;->I0()V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lys4;->I:Ljava/util/HashMap;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    new-instance v2, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, Lys4;->I:Ljava/util/HashMap;

    .line 73
    .line 74
    :cond_4
    sget-object p3, Lj9;->a:Lpp1;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-virtual {p4, v3}, Lks4;->c(I)F

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    const/4 v4, 0x0

    .line 82
    add-float/2addr v3, v4

    .line 83
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    sget-object p3, Lj9;->b:Lpp1;

    .line 95
    .line 96
    iget v3, p4, Lks4;->f:I

    .line 97
    .line 98
    add-int/lit8 v3, v3, -0x1

    .line 99
    .line 100
    invoke-virtual {p4, v3}, Lks4;->c(I)F

    .line 101
    .line 102
    .line 103
    move-result p4

    .line 104
    add-float/2addr p4, v4

    .line 105
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 106
    .line 107
    .line 108
    move-result p4

    .line 109
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    invoke-interface {v2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_5
    const/16 p3, 0x20

    .line 117
    .line 118
    shr-long p3, v0, p3

    .line 119
    .line 120
    long-to-int v3, p3

    .line 121
    const-wide p3, 0xffffffffL

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    and-long/2addr p3, v0

    .line 127
    long-to-int v4, p3

    .line 128
    invoke-static {v3, v3, v4, v4}, Lzz1;->m(IIII)J

    .line 129
    .line 130
    .line 131
    move-result-wide p3

    .line 132
    invoke-interface {p2, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iget-object v5, p0, Lys4;->I:Ljava/util/HashMap;

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v7, Lla;

    .line 142
    .line 143
    const/4 p0, 0x6

    .line 144
    invoke-direct {v7, p2, p0}, Lla;-><init>(Ljg3;I)V

    .line 145
    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    move-object v2, p1

    .line 149
    invoke-virtual/range {v2 .. v7}, Lcf2;->T(IILjava/util/Map;Lif1;Lif1;)Lvi2;

    .line 150
    .line 151
    .line 152
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    move-object p0, v0

    .line 159
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 160
    .line 161
    .line 162
    throw p0
.end method
