.class public final Ldefpackage/g74;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ldefpackage/a74;

.field public b:Ldefpackage/tb;

.field public c:Ldefpackage/y71;

.field public d:Ldefpackage/hb3;

.field public e:Z

.field public f:Ldefpackage/na4;

.field public final g:Ldefpackage/z64;

.field public final h:Ldefpackage/x64;

.field public i:Z

.field public j:I

.field public k:Ldefpackage/q64;

.field public final l:Ldefpackage/e74;

.field public final m:Ldefpackage/kl3;


# direct methods
.method public constructor <init>(Ldefpackage/a74;Ldefpackage/tb;Ldefpackage/y71;Ldefpackage/hb3;ZLdefpackage/na4;Ldefpackage/z64;Ldefpackage/x64;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/g74;->b:Ldefpackage/tb;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/g74;->c:Ldefpackage/y71;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 11
    .line 12
    iput-boolean p5, p0, Ldefpackage/g74;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/g74;->f:Ldefpackage/na4;

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/g74;->g:Ldefpackage/z64;

    .line 17
    .line 18
    iput-object p8, p0, Ldefpackage/g74;->h:Ldefpackage/x64;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput p1, p0, Ldefpackage/g74;->j:I

    .line 22
    .line 23
    sget-object p1, Ldefpackage/v64;->a:Ldefpackage/t64;

    .line 24
    .line 25
    iput-object p1, p0, Ldefpackage/g74;->k:Ldefpackage/q64;

    .line 26
    .line 27
    new-instance p1, Ldefpackage/e74;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Ldefpackage/e74;-><init>(Ldefpackage/g74;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ldefpackage/g74;->l:Ldefpackage/e74;

    .line 33
    .line 34
    new-instance p1, Ldefpackage/kl3;

    .line 35
    .line 36
    const/4 p2, 0x6

    .line 37
    invoke-direct {p1, p2, p0}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ldefpackage/g74;->m:Ldefpackage/kl3;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(JLdefpackage/wd0;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Ldefpackage/b74;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ldefpackage/b74;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/b74;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldefpackage/b74;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/b74;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ldefpackage/b74;-><init>(Ldefpackage/g74;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ldefpackage/b74;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/b74;->q:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Ldefpackage/b74;->n:Ldefpackage/ix3;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    move-object v5, p0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v5, p0

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Ldefpackage/ix3;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-wide p1, v6, Ldefpackage/ix3;->n:J

    .line 62
    .line 63
    iput-boolean v3, p0, Ldefpackage/g74;->i:Z

    .line 64
    .line 65
    :try_start_1
    sget-object p3, Ldefpackage/h13;->n:Ldefpackage/h13;

    .line 66
    .line 67
    new-instance v4, Ldefpackage/d74;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    move-object v5, p0

    .line 71
    move-wide v7, p1

    .line 72
    :try_start_2
    invoke-direct/range {v4 .. v9}, Ldefpackage/d74;-><init>(Ldefpackage/g74;Ldefpackage/ix3;JLdefpackage/vd0;)V

    .line 73
    .line 74
    .line 75
    iput-object v6, v0, Ldefpackage/b74;->n:Ldefpackage/ix3;

    .line 76
    .line 77
    iput v3, v0, Ldefpackage/b74;->q:I

    .line 78
    .line 79
    invoke-virtual {v5, p3, v4, v0}, Ldefpackage/g74;->g(Ldefpackage/h13;Ldefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 84
    .line 85
    if-ne p0, p1, :cond_3

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_3
    move-object p1, v6

    .line 89
    :goto_1
    iput-boolean v2, v5, Ldefpackage/g74;->i:Z

    .line 90
    .line 91
    iget-wide p0, p1, Ldefpackage/ix3;->n:J

    .line 92
    .line 93
    new-instance p2, Ldefpackage/k45;

    .line 94
    .line 95
    invoke-direct {p2, p0, p1}, Ldefpackage/k45;-><init>(J)V

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :goto_2
    move-object p1, v0

    .line 101
    goto :goto_3

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    move-object v5, p0

    .line 104
    goto :goto_2

    .line 105
    :goto_3
    iput-boolean v2, v5, Ldefpackage/g74;->i:Z

    .line 106
    .line 107
    throw p1
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 2
    .line 3
    invoke-interface {v0}, Ldefpackage/a74;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 11
    .line 12
    invoke-interface {v0}, Ldefpackage/a74;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/g74;->b:Ldefpackage/tb;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/tb;->e()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-ne p0, v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_1
    :goto_0
    return v1
.end method

.method public final c(JZLdefpackage/ep4;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Ldefpackage/g74;->c:Ldefpackage/y71;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/v64;->a:Ldefpackage/t64;

    .line 8
    .line 9
    instance-of p3, p3, Ldefpackage/uk0;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object p3, p0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 15
    .line 16
    sget-object v1, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne p3, v1, :cond_1

    .line 20
    .line 21
    const/4 p3, 0x1

    .line 22
    :goto_0
    invoke-static {p1, p2, v2, v2, p3}, Ldefpackage/k45;->a(JFFI)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p3, 0x2

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    new-instance p3, Ldefpackage/f74;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {p3, p0, v1}, Ldefpackage/f74;-><init>(Ldefpackage/g74;Ldefpackage/vd0;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Ldefpackage/g74;->b:Ldefpackage/tb;

    .line 36
    .line 37
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Ldefpackage/g74;->b()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, p1, p2, p3, p4}, Ldefpackage/tb;->b(JLdefpackage/f74;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-ne p0, v2, :cond_3

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    new-instance p0, Ldefpackage/f74;

    .line 55
    .line 56
    iget-object p3, p3, Ldefpackage/f74;->r:Ldefpackage/g74;

    .line 57
    .line 58
    invoke-direct {p0, p3, p4}, Ldefpackage/f74;-><init>(Ldefpackage/g74;Ldefpackage/vd0;)V

    .line 59
    .line 60
    .line 61
    iput-wide p1, p0, Ldefpackage/f74;->q:J

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ldefpackage/f74;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v2, :cond_3

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_3
    :goto_2
    return-object v0
.end method

.method public final d(Ldefpackage/q64;JI)J
    .locals 14

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    iget-object v2, p0, Ldefpackage/g74;->f:Ldefpackage/na4;

    .line 4
    .line 5
    iget-object v2, v2, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/e53;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, Ldefpackage/e53;->r0()Ldefpackage/e53;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v3

    .line 18
    :goto_0
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    move/from16 v7, p4

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2, v7, v0, v1}, Ldefpackage/e53;->x(IJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v8

    .line 28
    move-wide v12, v8

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-wide v12, v4

    .line 31
    :goto_1
    invoke-static {v0, v1, v12, v13}, Ldefpackage/g83;->d(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    iget-object v2, p0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 36
    .line 37
    sget-object v6, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    if-ne v2, v6, :cond_2

    .line 41
    .line 42
    invoke-static {v8, v0, v1}, Ldefpackage/g83;->a(IJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/4 v2, 0x2

    .line 48
    invoke-static {v2, v0, v1}, Ldefpackage/g83;->a(IJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v9

    .line 52
    :goto_2
    invoke-virtual {p0, v9, v10}, Ldefpackage/g74;->f(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    invoke-virtual {p0, v9, v10}, Ldefpackage/g74;->h(J)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-interface {p1, v2}, Ldefpackage/q64;->a(F)F

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {p0, v2}, Ldefpackage/g74;->i(F)J

    .line 65
    .line 66
    .line 67
    move-result-wide v9

    .line 68
    invoke-virtual {p0, v9, v10}, Ldefpackage/g74;->f(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    iget-object v2, p0, Ldefpackage/g74;->g:Ldefpackage/z64;

    .line 73
    .line 74
    iget-boolean v6, v2, Ldefpackage/cx2;->A:Z

    .line 75
    .line 76
    if-nez v6, :cond_3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    invoke-static {v2}, Ldefpackage/j51;->P(Ldefpackage/eo0;)Ldefpackage/ub3;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ldefpackage/ra;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :try_start_0
    sget-object v6, Ldefpackage/ra;->Z0:Ljava/lang/reflect/Method;

    .line 90
    .line 91
    if-nez v6, :cond_4

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    const-string v11, "dispatchOnScrollChanged"

    .line 98
    .line 99
    invoke-virtual {v6, v11, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v6, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 104
    .line 105
    .line 106
    sput-object v6, Ldefpackage/ra;->Z0:Ljava/lang/reflect/Method;

    .line 107
    .line 108
    :cond_4
    sget-object v6, Ldefpackage/ra;->Z0:Ljava/lang/reflect/Method;

    .line 109
    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    invoke-virtual {v6, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    :catch_0
    :cond_5
    :goto_3
    invoke-static {v0, v1, v9, v10}, Ldefpackage/g83;->d(JJ)J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    iget-object p0, p0, Ldefpackage/g74;->f:Ldefpackage/na4;

    .line 120
    .line 121
    iget-object p0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, Ldefpackage/e53;

    .line 124
    .line 125
    if-eqz p0, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Ldefpackage/e53;->r0()Ldefpackage/e53;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :cond_6
    move-object v6, v3

    .line 132
    move-wide v8, v9

    .line 133
    if-eqz v6, :cond_7

    .line 134
    .line 135
    move-wide v10, v0

    .line 136
    invoke-virtual/range {v6 .. v11}, Ldefpackage/e53;->R(IJJ)J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    :cond_7
    invoke-static {v12, v13, v8, v9}, Ldefpackage/g83;->e(JJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    invoke-static {v0, v1, v4, v5}, Ldefpackage/g83;->e(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    return-wide v0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/g74;->e:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, -0x40800000    # -1.0f

    .line 6
    .line 7
    mul-float/2addr p1, p0

    .line 8
    :cond_0
    return p1
.end method

.method public final f(J)J
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/g74;->e:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, -0x40800000    # -1.0f

    .line 6
    .line 7
    invoke-static {p1, p2, p0}, Ldefpackage/g83;->f(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0

    .line 12
    :cond_0
    return-wide p1
.end method

.method public final g(Ldefpackage/h13;Ldefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/r;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xd

    .line 7
    .line 8
    invoke-direct {v1, p0, p2, v2, v3}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, v1, p3}, Ldefpackage/a74;->e(Ldefpackage/h13;Ldefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 21
    .line 22
    return-object p0
.end method

.method public final h(J)F
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 2
    .line 3
    sget-object v0, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x20

    .line 8
    .line 9
    shr-long p0, p1, p0

    .line 10
    .line 11
    :goto_0
    long-to-int p0, p0

    .line 12
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long p0, p1, v0

    .line 23
    .line 24
    goto :goto_0
.end method

.method public final i(F)J
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-wide/16 p0, 0x0

    .line 7
    .line 8
    return-wide p0

    .line 9
    :cond_0
    iget-object p0, p0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 10
    .line 11
    sget-object v1, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 12
    .line 13
    const-wide v2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    if-ne p0, v1, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long p0, p0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v0, v0

    .line 32
    shl-long/2addr p0, v4

    .line 33
    and-long/2addr v0, v2

    .line 34
    or-long/2addr p0, v0

    .line 35
    return-wide p0

    .line 36
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-long v0, p0

    .line 41
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    int-to-long p0, p0

    .line 46
    shl-long/2addr v0, v4

    .line 47
    and-long/2addr p0, v2

    .line 48
    or-long/2addr p0, v0

    .line 49
    return-wide p0
.end method

.method public final j(J)F
    .locals 5

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p1

    .line 7
    long-to-int v0, v0

    .line 8
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v2

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    float-to-double v1, v1

    .line 29
    float-to-double v3, p2

    .line 30
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    double-to-float p2, v1

    .line 35
    float-to-double v1, p2

    .line 36
    const-wide v3, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmpl-double p2, v1, v3

    .line 42
    .line 43
    iget-object p0, p0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-ltz p2, :cond_1

    .line 47
    .line 48
    sget-object p1, Ldefpackage/hb3;->n:Ldefpackage/hb3;

    .line 49
    .line 50
    if-ne p0, p1, :cond_0

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_0
    return v1

    .line 58
    :cond_1
    sget-object p2, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 59
    .line 60
    if-ne p0, p2, :cond_2

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_2
    return v1
.end method
