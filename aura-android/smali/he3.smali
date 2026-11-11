.class public final Lhe3;
.super Li35;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public b:Luo;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:Luo;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lym4;

.field public final r:Lnc;

.field public s:Lnc;

.field public t:Lnc;

.field public final u:Lr72;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lhe3;->c:F

    .line 7
    .line 8
    sget v1, Lc45;->a:I

    .line 9
    .line 10
    sget-object v1, Lu01;->n:Lu01;

    .line 11
    .line 12
    iput-object v1, p0, Lhe3;->d:Ljava/util/List;

    .line 13
    .line 14
    iput v0, p0, Lhe3;->e:F

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Lhe3;->h:I

    .line 18
    .line 19
    iput v1, p0, Lhe3;->i:I

    .line 20
    .line 21
    const/high16 v1, 0x40800000    # 4.0f

    .line 22
    .line 23
    iput v1, p0, Lhe3;->j:F

    .line 24
    .line 25
    iput v0, p0, Lhe3;->l:F

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lhe3;->n:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lhe3;->o:Z

    .line 31
    .line 32
    invoke-static {}, Lpc;->a()Lnc;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lhe3;->r:Lnc;

    .line 37
    .line 38
    iput-object v0, p0, Lhe3;->s:Lnc;

    .line 39
    .line 40
    new-instance v0, Lrd2;

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    invoke-direct {v0, v1}, Lrd2;-><init>(I)V

    .line 44
    .line 45
    .line 46
    sget-object v1, Lb92;->n:Lb92;

    .line 47
    .line 48
    invoke-static {v1, v0}, Lrr2;->K(Lb92;Lgf1;)Lr72;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lhe3;->u:Lr72;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(Lsv0;)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lhe3;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lhe3;->d:Ljava/util/List;

    .line 6
    .line 7
    iget-object v1, p0, Lhe3;->r:Lnc;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lgh0;->E(Ljava/util/List;Lnc;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lhe3;->e()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-boolean v0, p0, Lhe3;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lhe3;->e()V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lhe3;->n:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lhe3;->p:Z

    .line 27
    .line 28
    iget-object v3, p0, Lhe3;->b:Luo;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v2, p0, Lhe3;->s:Lnc;

    .line 33
    .line 34
    iget v4, p0, Lhe3;->c:F

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v6, 0x38

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    invoke-static/range {v1 .. v6}, Lsv0;->I(Lsv0;Lnc;Luo;FLym4;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v1, p1

    .line 45
    :goto_1
    iget-object v9, p0, Lhe3;->g:Luo;

    .line 46
    .line 47
    if-eqz v9, :cond_5

    .line 48
    .line 49
    iget-object p1, p0, Lhe3;->q:Lym4;

    .line 50
    .line 51
    iget-boolean v2, p0, Lhe3;->o:Z

    .line 52
    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    :goto_2
    move-object v11, p1

    .line 59
    goto :goto_4

    .line 60
    :cond_4
    :goto_3
    new-instance p1, Lym4;

    .line 61
    .line 62
    iget v2, p0, Lhe3;->f:F

    .line 63
    .line 64
    iget v3, p0, Lhe3;->j:F

    .line 65
    .line 66
    iget v4, p0, Lhe3;->h:I

    .line 67
    .line 68
    iget v5, p0, Lhe3;->i:I

    .line 69
    .line 70
    invoke-direct {p1, v2, v3, v4, v5}, Lym4;-><init>(FFII)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lhe3;->q:Lym4;

    .line 74
    .line 75
    iput-boolean v0, p0, Lhe3;->o:Z

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_4
    iget-object v8, p0, Lhe3;->s:Lnc;

    .line 79
    .line 80
    iget v10, p0, Lhe3;->e:F

    .line 81
    .line 82
    const/16 v12, 0x30

    .line 83
    .line 84
    move-object v7, v1

    .line 85
    invoke-static/range {v7 .. v12}, Lsv0;->I(Lsv0;Lnc;Luo;FLym4;I)V

    .line 86
    .line 87
    .line 88
    :cond_5
    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    iget v0, p0, Lhe3;->k:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, Lhe3;->r:Lnc;

    .line 7
    .line 8
    const/high16 v3, 0x3f800000    # 1.0f

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lhe3;->l:F

    .line 13
    .line 14
    cmpg-float v0, v0, v3

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iput-object v2, p0, Lhe3;->s:Lnc;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lhe3;->s:Lnc;

    .line 22
    .line 23
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lpc;->a()Lnc;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lhe3;->s:Lnc;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iget-object v0, p0, Lhe3;->s:Lnc;

    .line 38
    .line 39
    iget-object v0, v0, Lnc;->a:Landroid/graphics/Path;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-ne v0, v5, :cond_2

    .line 49
    .line 50
    move v0, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v0, v4

    .line 53
    :goto_0
    iget-object v7, p0, Lhe3;->s:Lnc;

    .line 54
    .line 55
    iget-object v7, v7, Lnc;->a:Landroid/graphics/Path;

    .line 56
    .line 57
    invoke-virtual {v7}, Landroid/graphics/Path;->rewind()V

    .line 58
    .line 59
    .line 60
    iget-object v7, p0, Lhe3;->s:Lnc;

    .line 61
    .line 62
    iget-object v7, v7, Lnc;->a:Landroid/graphics/Path;

    .line 63
    .line 64
    if-ne v0, v6, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v7, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    iget-object v0, p0, Lhe3;->u:Lr72;

    .line 73
    .line 74
    invoke-interface {v0}, Lr72;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Loc;

    .line 79
    .line 80
    iget-object v5, v5, Loc;->a:Landroid/graphics/PathMeasure;

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    iget-object v2, v2, Lnc;->a:Landroid/graphics/Path;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/4 v2, 0x0

    .line 88
    :goto_3
    invoke-virtual {v5, v2, v4}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Lr72;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Loc;

    .line 96
    .line 97
    iget-object v2, v2, Loc;->a:Landroid/graphics/PathMeasure;

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    iget v4, p0, Lhe3;->k:F

    .line 104
    .line 105
    iget v5, p0, Lhe3;->m:F

    .line 106
    .line 107
    add-float/2addr v4, v5

    .line 108
    rem-float/2addr v4, v3

    .line 109
    mul-float/2addr v4, v2

    .line 110
    iget v6, p0, Lhe3;->l:F

    .line 111
    .line 112
    add-float/2addr v6, v5

    .line 113
    rem-float/2addr v6, v3

    .line 114
    mul-float/2addr v6, v2

    .line 115
    cmpl-float v3, v4, v6

    .line 116
    .line 117
    if-lez v3, :cond_6

    .line 118
    .line 119
    iget-object v3, p0, Lhe3;->t:Lnc;

    .line 120
    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    invoke-static {}, Lpc;->a()Lnc;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iput-object v3, p0, Lhe3;->t:Lnc;

    .line 129
    .line 130
    :goto_4
    iget-object v5, v3, Lnc;->a:Landroid/graphics/Path;

    .line 131
    .line 132
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v0}, Lr72;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Loc;

    .line 140
    .line 141
    invoke-virtual {v7, v4, v2, v3}, Loc;->a(FFLnc;)V

    .line 142
    .line 143
    .line 144
    iget-object v2, p0, Lhe3;->s:Lnc;

    .line 145
    .line 146
    invoke-static {v2, v3}, Lnc;->a(Lnc;Lnc;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v0}, Lr72;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Loc;

    .line 157
    .line 158
    invoke-virtual {v0, v1, v6, v3}, Loc;->a(FFLnc;)V

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, Lhe3;->s:Lnc;

    .line 162
    .line 163
    invoke-static {p0, v3}, Lnc;->a(Lnc;Lnc;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_6
    invoke-interface {v0}, Lr72;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Loc;

    .line 172
    .line 173
    iget-object p0, p0, Lhe3;->s:Lnc;

    .line 174
    .line 175
    invoke-virtual {v0, v4, v6, p0}, Loc;->a(FFLnc;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lhe3;->r:Lnc;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
