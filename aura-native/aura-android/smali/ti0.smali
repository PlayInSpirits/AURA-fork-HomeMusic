.class public final Lti0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrd;


# instance fields
.field public final a:Lna4;

.field public final b:Lhd5;

.field public final c:Ljava/lang/Object;

.field public final d:Lce;

.field public final e:Lce;

.field public final f:Lce;

.field public final g:Ljava/lang/Object;

.field public final h:J


# direct methods
.method public constructor <init>(Lui0;Ljava/lang/Object;Lce;)V
    .locals 11

    .line 1
    new-instance v0, Lna4;

    .line 2
    .line 3
    iget-object p1, p1, Lui0;->a:Lrm2;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lna4;-><init>(Lrm2;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lti0;->a:Lna4;

    .line 12
    .line 13
    sget-object p1, Lp35;->a:Lhd5;

    .line 14
    .line 15
    iput-object p1, p0, Lti0;->b:Lhd5;

    .line 16
    .line 17
    iput-object p2, p0, Lti0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p1, Lhd5;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lif1;

    .line 22
    .line 23
    invoke-interface {v1, p2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lce;

    .line 28
    .line 29
    iput-object p2, p0, Lti0;->d:Lce;

    .line 30
    .line 31
    invoke-static {p3}, Lkb4;->n(Lce;)Lce;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Lti0;->e:Lce;

    .line 36
    .line 37
    iget-object p1, p1, Lhd5;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lif1;

    .line 40
    .line 41
    invoke-virtual {v0, p2, p3}, Lna4;->D(Lce;Lce;)Lce;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {p1, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lti0;->g:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object p1, v0, Lna4;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lce;

    .line 54
    .line 55
    if-nez p1, :cond_0

    .line 56
    .line 57
    invoke-virtual {p2}, Lce;->c()Lce;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, v0, Lna4;->p:Ljava/lang/Object;

    .line 62
    .line 63
    :cond_0
    iget-object p1, v0, Lna4;->p:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lce;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1}, Lce;->b()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v1, 0x0

    .line 74
    const-wide/16 v2, 0x0

    .line 75
    .line 76
    move v4, v1

    .line 77
    :goto_0
    if-ge v4, p1, :cond_1

    .line 78
    .line 79
    iget-object v5, v0, Lna4;->n:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, Lrm2;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, v4}, Lce;->a(I)F

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    iget-object v5, v5, Lrm2;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Lyx0;

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Lyx0;->b(F)D

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    sget v7, La81;->a:F

    .line 99
    .line 100
    float-to-double v7, v7

    .line 101
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 102
    .line 103
    sub-double/2addr v7, v9

    .line 104
    div-double/2addr v5, v7

    .line 105
    invoke-static {v5, v6}, Ljava/lang/Math;->exp(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    mul-double/2addr v5, v7

    .line 115
    double-to-long v5, v5

    .line 116
    const-wide/32 v7, 0xf4240

    .line 117
    .line 118
    .line 119
    mul-long/2addr v5, v7

    .line 120
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    add-int/lit8 v4, v4, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    iput-wide v2, p0, Lti0;->h:J

    .line 128
    .line 129
    iget-object p1, p0, Lti0;->a:Lna4;

    .line 130
    .line 131
    iget-object p2, p0, Lti0;->d:Lce;

    .line 132
    .line 133
    invoke-virtual {p1, v2, v3, p2, p3}, Lna4;->E(JLce;Lce;)Lce;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p1}, Lkb4;->n(Lce;)Lce;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lti0;->f:Lce;

    .line 142
    .line 143
    invoke-virtual {p1}, Lce;->b()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    :goto_1
    if-ge v1, p1, :cond_2

    .line 148
    .line 149
    iget-object p2, p0, Lti0;->f:Lce;

    .line 150
    .line 151
    invoke-virtual {p2, v1}, Lce;->a(I)F

    .line 152
    .line 153
    .line 154
    move-result p3

    .line 155
    iget-object v0, p0, Lti0;->a:Lna4;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lti0;->a:Lna4;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    const/high16 v2, -0x80000000

    .line 167
    .line 168
    invoke-static {p3, v2, v0}, Lgb;->l(FFF)F

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    invoke-virtual {p2, v1, p3}, Lce;->d(IF)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_2
    return-void

    .line 179
    :cond_3
    const-string p0, "velocityVector"

    .line 180
    .line 181
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    const/4 p0, 0x0

    .line 185
    throw p0
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lti0;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Lhd5;
    .locals 0

    .line 1
    iget-object p0, p0, Lti0;->b:Lhd5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(J)Lce;
    .locals 2

    .line 1
    invoke-interface {p0, p1, p2}, Lrd;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lti0;->d:Lce;

    .line 8
    .line 9
    iget-object v1, p0, Lti0;->e:Lce;

    .line 10
    .line 11
    iget-object p0, p0, Lti0;->a:Lna4;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, v0, v1}, Lna4;->E(JLce;Lce;)Lce;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, Lti0;->f:Lce;

    .line 19
    .line 20
    return-object p0
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p0 .. p2}, Lrd;->e(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    iget-object v1, v0, Lti0;->b:Lhd5;

    .line 10
    .line 11
    iget-object v1, v1, Lhd5;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lif1;

    .line 14
    .line 15
    iget-object v2, v0, Lti0;->a:Lna4;

    .line 16
    .line 17
    iget-object v3, v2, Lna4;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lce;

    .line 20
    .line 21
    iget-object v4, v0, Lti0;->d:Lce;

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v4}, Lce;->c()Lce;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iput-object v3, v2, Lna4;->o:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    iget-object v3, v2, Lna4;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Lce;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const-string v6, "valueVector"

    .line 37
    .line 38
    if-eqz v3, :cond_5

    .line 39
    .line 40
    invoke-virtual {v3}, Lce;->b()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v7, 0x0

    .line 45
    :goto_0
    iget-object v8, v2, Lna4;->o:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v8, Lce;

    .line 48
    .line 49
    if-ge v7, v3, :cond_3

    .line 50
    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    iget-object v9, v2, Lna4;->n:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Lrm2;

    .line 56
    .line 57
    invoke-virtual {v4, v7}, Lce;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    iget-object v11, v0, Lti0;->e:Lce;

    .line 62
    .line 63
    invoke-virtual {v11, v7}, Lce;->a(I)F

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    const-wide/32 v12, 0xf4240

    .line 68
    .line 69
    .line 70
    div-long v12, p1, v12

    .line 71
    .line 72
    iget-object v9, v9, Lrm2;->o:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, Lyx0;

    .line 75
    .line 76
    invoke-virtual {v9, v11}, Lyx0;->a(F)Lz71;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    iget-wide v14, v9, Lz71;->c:J

    .line 81
    .line 82
    const-wide/16 v16, 0x0

    .line 83
    .line 84
    cmp-long v11, v14, v16

    .line 85
    .line 86
    if-lez v11, :cond_1

    .line 87
    .line 88
    long-to-float v11, v12

    .line 89
    long-to-float v12, v14

    .line 90
    div-float/2addr v11, v12

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    const/high16 v11, 0x3f800000    # 1.0f

    .line 93
    .line 94
    :goto_1
    iget v12, v9, Lz71;->b:F

    .line 95
    .line 96
    iget v9, v9, Lz71;->a:F

    .line 97
    .line 98
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    mul-float/2addr v9, v12

    .line 103
    invoke-static {v11}, Lyb;->a(F)Lxb;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    iget v11, v11, Lxb;->a:F

    .line 108
    .line 109
    mul-float/2addr v9, v11

    .line 110
    add-float/2addr v9, v10

    .line 111
    invoke-virtual {v8, v7, v9}, Lce;->d(IF)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v7, v7, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :cond_3
    if-eqz v8, :cond_4

    .line 122
    .line 123
    invoke-interface {v1, v8}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0

    .line 128
    :cond_4
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v5

    .line 132
    :cond_5
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v5

    .line 136
    :cond_6
    iget-object v0, v0, Lti0;->g:Ljava/lang/Object;

    .line 137
    .line 138
    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lti0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
