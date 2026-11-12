.class public final Lb24;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loo0;


# instance fields
.field public A:Lr62;

.field public B:I

.field public C:Lya4;

.field public n:I

.field public o:F

.field public p:F

.field public q:F

.field public r:J

.field public s:J

.field public t:F

.field public u:J

.field public v:Lac4;

.field public w:Z

.field public x:J

.field public y:Lm62;

.field public z:Loo0;


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
    iput v0, p0, Lb24;->o:F

    .line 7
    .line 8
    iput v0, p0, Lb24;->p:F

    .line 9
    .line 10
    iput v0, p0, Lb24;->q:F

    .line 11
    .line 12
    sget-wide v1, Lwj1;->a:J

    .line 13
    .line 14
    iput-wide v1, p0, Lb24;->r:J

    .line 15
    .line 16
    iput-wide v1, p0, Lb24;->s:J

    .line 17
    .line 18
    const/high16 v1, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v1, p0, Lb24;->t:F

    .line 21
    .line 22
    sget-wide v1, Ltw4;->a:J

    .line 23
    .line 24
    iput-wide v1, p0, Lb24;->u:J

    .line 25
    .line 26
    sget-object v1, Lkb4;->b:Lsp1;

    .line 27
    .line 28
    iput-object v1, p0, Lb24;->v:Lac4;

    .line 29
    .line 30
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v1, p0, Lb24;->x:J

    .line 36
    .line 37
    sget-object v1, Lm62;->a:Lm62;

    .line 38
    .line 39
    iput-object v1, p0, Lb24;->y:Lm62;

    .line 40
    .line 41
    new-instance v1, Lro0;

    .line 42
    .line 43
    invoke-direct {v1, v0, v0}, Lro0;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lb24;->z:Loo0;

    .line 47
    .line 48
    sget-object v0, Lr62;->n:Lr62;

    .line 49
    .line 50
    iput-object v0, p0, Lb24;->A:Lr62;

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    iput v0, p0, Lb24;->B:I

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final J()F
    .locals 0

    .line 1
    iget-object p0, p0, Lb24;->z:Loo0;

    .line 2
    .line 3
    invoke-interface {p0}, Loo0;->J()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final a()V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lb24;->c(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lb24;->e(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lb24;->b(F)V

    .line 10
    .line 11
    .line 12
    sget-wide v0, Lwj1;->a:J

    .line 13
    .line 14
    iget-wide v2, p0, Lb24;->r:J

    .line 15
    .line 16
    invoke-static {v2, v3, v0, v1}, Lx40;->c(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iget v2, p0, Lb24;->n:I

    .line 23
    .line 24
    or-int/lit8 v2, v2, 0x40

    .line 25
    .line 26
    iput v2, p0, Lb24;->n:I

    .line 27
    .line 28
    iput-wide v0, p0, Lb24;->r:J

    .line 29
    .line 30
    :cond_0
    iget-wide v2, p0, Lb24;->s:J

    .line 31
    .line 32
    invoke-static {v2, v3, v0, v1}, Lx40;->c(JJ)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    iget v2, p0, Lb24;->n:I

    .line 39
    .line 40
    or-int/lit16 v2, v2, 0x80

    .line 41
    .line 42
    iput v2, p0, Lb24;->n:I

    .line 43
    .line 44
    iput-wide v0, p0, Lb24;->s:J

    .line 45
    .line 46
    :cond_1
    iget v0, p0, Lb24;->t:F

    .line 47
    .line 48
    const/high16 v1, 0x41000000    # 8.0f

    .line 49
    .line 50
    cmpg-float v0, v0, v1

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget v0, p0, Lb24;->n:I

    .line 56
    .line 57
    or-int/lit16 v0, v0, 0x800

    .line 58
    .line 59
    iput v0, p0, Lb24;->n:I

    .line 60
    .line 61
    iput v1, p0, Lb24;->t:F

    .line 62
    .line 63
    :goto_0
    sget-wide v0, Ltw4;->a:J

    .line 64
    .line 65
    iget-wide v2, p0, Lb24;->u:J

    .line 66
    .line 67
    cmp-long v2, v2, v0

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget v2, p0, Lb24;->n:I

    .line 73
    .line 74
    or-int/lit16 v2, v2, 0x1000

    .line 75
    .line 76
    iput v2, p0, Lb24;->n:I

    .line 77
    .line 78
    iput-wide v0, p0, Lb24;->u:J

    .line 79
    .line 80
    :goto_1
    sget-object v0, Lkb4;->b:Lsp1;

    .line 81
    .line 82
    iget-object v1, p0, Lb24;->v:Lac4;

    .line 83
    .line 84
    invoke-static {v1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    iget v1, p0, Lb24;->n:I

    .line 91
    .line 92
    or-int/lit16 v1, v1, 0x2000

    .line 93
    .line 94
    iput v1, p0, Lb24;->n:I

    .line 95
    .line 96
    iput-object v0, p0, Lb24;->v:Lac4;

    .line 97
    .line 98
    :cond_4
    iget-boolean v0, p0, Lb24;->w:Z

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    iget v0, p0, Lb24;->n:I

    .line 104
    .line 105
    or-int/lit16 v0, v0, 0x4000

    .line 106
    .line 107
    iput v0, p0, Lb24;->n:I

    .line 108
    .line 109
    iput-boolean v1, p0, Lb24;->w:Z

    .line 110
    .line 111
    :cond_5
    iget v0, p0, Lb24;->B:I

    .line 112
    .line 113
    const/4 v2, 0x3

    .line 114
    if-ne v0, v2, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    iget v0, p0, Lb24;->n:I

    .line 118
    .line 119
    const/high16 v3, 0x80000

    .line 120
    .line 121
    or-int/2addr v0, v3

    .line 122
    iput v0, p0, Lb24;->n:I

    .line 123
    .line 124
    iput v2, p0, Lb24;->B:I

    .line 125
    .line 126
    :goto_2
    sget-object v0, Lm62;->a:Lm62;

    .line 127
    .line 128
    iget-object v2, p0, Lb24;->y:Lm62;

    .line 129
    .line 130
    invoke-static {v2, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_7

    .line 135
    .line 136
    iget v2, p0, Lb24;->n:I

    .line 137
    .line 138
    const/high16 v3, 0x100000

    .line 139
    .line 140
    or-int/2addr v2, v3

    .line 141
    iput v2, p0, Lb24;->n:I

    .line 142
    .line 143
    iput-object v0, p0, Lb24;->y:Lm62;

    .line 144
    .line 145
    :cond_7
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    iput-wide v2, p0, Lb24;->x:J

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    iput-object v0, p0, Lb24;->C:Lya4;

    .line 154
    .line 155
    iput v1, p0, Lb24;->n:I

    .line 156
    .line 157
    return-void
.end method

.method public final b(F)V
    .locals 1

    .line 1
    iget v0, p0, Lb24;->q:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lb24;->n:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Lb24;->n:I

    .line 13
    .line 14
    iput p1, p0, Lb24;->q:F

    .line 15
    .line 16
    return-void
.end method

.method public final c(F)V
    .locals 1

    .line 1
    iget v0, p0, Lb24;->o:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lb24;->n:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lb24;->n:I

    .line 13
    .line 14
    iput p1, p0, Lb24;->o:F

    .line 15
    .line 16
    return-void
.end method

.method public final e(F)V
    .locals 1

    .line 1
    iget v0, p0, Lb24;->p:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lb24;->n:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lb24;->n:I

    .line 13
    .line 14
    iput p1, p0, Lb24;->p:F

    .line 15
    .line 16
    return-void
.end method

.method public final g()F
    .locals 0

    .line 1
    iget-object p0, p0, Lb24;->z:Loo0;

    .line 2
    .line 3
    invoke-interface {p0}, Loo0;->g()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
