.class public final Ldefpackage/z64;
.super Ldefpackage/fo0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/j42;
.implements Ldefpackage/g94;
.implements Ldefpackage/rn3;
.implements Ldefpackage/my1;
.implements Ldefpackage/a90;
.implements Ldefpackage/mv0;


# instance fields
.field public D:Ldefpackage/hb3;

.field public E:Ldefpackage/k2;

.field public F:Z

.field public G:Ldefpackage/rm2;

.field public H:Ldefpackage/aw;

.field public I:Ldefpackage/jv0;

.field public J:Z

.field public K:Z

.field public L:Ldefpackage/su0;

.field public M:J

.field public N:Ldefpackage/jh1;

.field public O:Ldefpackage/jh1;

.field public P:Ldefpackage/vu0;

.field public Q:Ldefpackage/uu0;

.field public R:Ldefpackage/tu0;

.field public S:Ldefpackage/ya4;

.field public T:Ldefpackage/rm2;

.field public U:Ldefpackage/e20;

.field public V:Ldefpackage/ly1;

.field public final W:Ldefpackage/na4;

.field public X:Ldefpackage/z;

.field public Y:Ldefpackage/j2;

.field public Z:Z

.field public a0:Z

.field public b0:Ldefpackage/hy2;

.field public c0:Ldefpackage/hw4;

.field public final d0:Ldefpackage/uk0;

.field public final e0:Ldefpackage/g74;

.field public final f0:Ldefpackage/xk0;

.field public final g0:Ldefpackage/ba1;

.field public final h0:Ldefpackage/gd0;


# direct methods
.method public constructor <init>(Ldefpackage/tb;Ldefpackage/fv;Ldefpackage/y71;Ldefpackage/rm2;Ldefpackage/hb3;Ldefpackage/a74;ZZ)V
    .locals 11

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    sget-object v1, Ldefpackage/uo;->p:Ldefpackage/k2;

    .line 4
    .line 5
    invoke-direct {p0}, Ldefpackage/fo0;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p5

    .line 9
    .line 10
    iput-object v3, p0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 11
    .line 12
    iput-object v1, p0, Ldefpackage/z64;->E:Ldefpackage/k2;

    .line 13
    .line 14
    iput-boolean v0, p0, Ldefpackage/z64;->F:Z

    .line 15
    .line 16
    iput-object p4, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    iput-wide v1, p0, Ldefpackage/z64;->M:J

    .line 21
    .line 22
    new-instance p4, Ldefpackage/na4;

    .line 23
    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    invoke-direct {p4, v1}, Ldefpackage/na4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p4, p0, Ldefpackage/z64;->W:Ldefpackage/na4;

    .line 30
    .line 31
    new-instance p4, Ldefpackage/uk0;

    .line 32
    .line 33
    sget-object v2, Ldefpackage/v64;->c:Ldefpackage/dd3;

    .line 34
    .line 35
    new-instance v4, Ldefpackage/rm2;

    .line 36
    .line 37
    invoke-direct {v4, v2}, Ldefpackage/rm2;-><init>(Ldefpackage/oo0;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Ldefpackage/ui0;

    .line 41
    .line 42
    invoke-direct {v2, v4}, Ldefpackage/ui0;-><init>(Ldefpackage/rm2;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p4, v2}, Ldefpackage/uk0;-><init>(Ldefpackage/ui0;)V

    .line 46
    .line 47
    .line 48
    iput-object p4, p0, Ldefpackage/z64;->d0:Ldefpackage/uk0;

    .line 49
    .line 50
    if-nez p3, :cond_0

    .line 51
    .line 52
    move-object v5, p4

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v5, p3

    .line 55
    :goto_0
    iget-object v8, p0, Ldefpackage/z64;->W:Ldefpackage/na4;

    .line 56
    .line 57
    new-instance v2, Ldefpackage/g74;

    .line 58
    .line 59
    new-instance v10, Ldefpackage/x64;

    .line 60
    .line 61
    const/4 p3, 0x0

    .line 62
    invoke-direct {v10, p0, p3}, Ldefpackage/x64;-><init>(Ldefpackage/z64;I)V

    .line 63
    .line 64
    .line 65
    move-object v9, p0

    .line 66
    move-object v4, p1

    .line 67
    move/from16 v7, p8

    .line 68
    .line 69
    move-object v6, v3

    .line 70
    move-object/from16 v3, p6

    .line 71
    .line 72
    invoke-direct/range {v2 .. v10}, Ldefpackage/g74;-><init>(Ldefpackage/a74;Ldefpackage/tb;Ldefpackage/y71;Ldefpackage/hb3;ZLdefpackage/na4;Ldefpackage/z64;Ldefpackage/x64;)V

    .line 73
    .line 74
    .line 75
    iput-object v2, p0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 76
    .line 77
    new-instance p1, Ldefpackage/xk0;

    .line 78
    .line 79
    const/4 p3, 0x7

    .line 80
    invoke-direct {p1, v2, v0, p3}, Ldefpackage/xk0;-><init>(Ljava/lang/Object;ZI)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Ldefpackage/z64;->f0:Ldefpackage/xk0;

    .line 84
    .line 85
    new-instance p3, Ldefpackage/ba1;

    .line 86
    .line 87
    const/4 p4, 0x2

    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-direct {p3, p4, v0, v1}, Ldefpackage/ba1;-><init>(ILdefpackage/wf1;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p3}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 93
    .line 94
    .line 95
    iput-object p3, p0, Ldefpackage/z64;->g0:Ldefpackage/ba1;

    .line 96
    .line 97
    move-object v4, v2

    .line 98
    new-instance v2, Ldefpackage/gd0;

    .line 99
    .line 100
    new-instance v7, Ldefpackage/x64;

    .line 101
    .line 102
    const/4 p3, 0x1

    .line 103
    invoke-direct {v7, p0, p3}, Ldefpackage/x64;-><init>(Ldefpackage/z64;I)V

    .line 104
    .line 105
    .line 106
    move-object v6, p2

    .line 107
    move-object/from16 v3, p5

    .line 108
    .line 109
    move/from16 v5, p8

    .line 110
    .line 111
    invoke-direct/range {v2 .. v7}, Ldefpackage/gd0;-><init>(Ldefpackage/hb3;Ldefpackage/g74;ZLdefpackage/fv;Ldefpackage/x64;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v2}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 115
    .line 116
    .line 117
    iput-object v2, p0, Ldefpackage/z64;->h0:Ldefpackage/gd0;

    .line 118
    .line 119
    iget-object p2, p0, Ldefpackage/z64;->W:Ldefpackage/na4;

    .line 120
    .line 121
    new-instance p3, Ldefpackage/e53;

    .line 122
    .line 123
    invoke-direct {p3, p1, p2}, Ldefpackage/e53;-><init>(Ldefpackage/y43;Ldefpackage/na4;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p3}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 127
    .line 128
    .line 129
    new-instance p1, Ldefpackage/cv;

    .line 130
    .line 131
    invoke-direct {p1}, Ldefpackage/cx2;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v2, p1, Ldefpackage/cv;->B:Ldefpackage/gd0;

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public static final t0(Ldefpackage/z64;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Ldefpackage/ev0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldefpackage/ev0;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/ev0;->p:I

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
    iput v1, v0, Ldefpackage/ev0;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/ev0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ldefpackage/ev0;-><init>(Ldefpackage/z64;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ldefpackage/ev0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/ev0;->p:I

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
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    new-instance v4, Ldefpackage/iv0;

    .line 57
    .line 58
    invoke-direct {v4, p1}, Ldefpackage/iv0;-><init>(Ldefpackage/jv0;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Ldefpackage/ev0;->p:I

    .line 62
    .line 63
    invoke-virtual {v1, v4, v0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 68
    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_1
    iput-object v2, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 73
    .line 74
    :cond_4
    new-instance p1, Ldefpackage/zu0;

    .line 75
    .line 76
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {p1, v3, v0, v1}, Ldefpackage/zu0;-><init>(ZJ)V

    .line 80
    .line 81
    .line 82
    iget-boolean v0, p0, Ldefpackage/cx2;->A:Z

    .line 83
    .line 84
    if-nez v0, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    iget-object v0, p0, Ldefpackage/z64;->W:Ldefpackage/na4;

    .line 88
    .line 89
    invoke-virtual {v0}, Ldefpackage/na4;->x()Ldefpackage/we0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, Ldefpackage/p;

    .line 94
    .line 95
    const/16 v3, 0x10

    .line 96
    .line 97
    invoke-direct {v1, p1, p0, v2, v3}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x3

    .line 101
    invoke-static {v0, v2, v2, v1, p0}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 102
    .line 103
    .line 104
    :goto_2
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 105
    .line 106
    return-object p0
.end method

.method public static final u0(Ldefpackage/z64;Ldefpackage/yu0;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Ldefpackage/fv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldefpackage/fv0;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/fv0;->r:I

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
    iput v1, v0, Ldefpackage/fv0;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/fv0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ldefpackage/fv0;-><init>(Ldefpackage/z64;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldefpackage/fv0;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/fv0;->r:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Ldefpackage/fv0;->o:Ldefpackage/jv0;

    .line 40
    .line 41
    iget-object v0, v0, Ldefpackage/fv0;->n:Ldefpackage/yu0;

    .line 42
    .line 43
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Ldefpackage/fv0;->n:Ldefpackage/yu0;

    .line 55
    .line 56
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    new-instance v5, Ldefpackage/iv0;

    .line 72
    .line 73
    invoke-direct {v5, p2}, Ldefpackage/iv0;-><init>(Ldefpackage/jv0;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Ldefpackage/fv0;->n:Ldefpackage/yu0;

    .line 77
    .line 78
    iput v3, v0, Ldefpackage/fv0;->r:I

    .line 79
    .line 80
    invoke-virtual {v1, v5, v0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_1
    new-instance p2, Ldefpackage/jv0;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iput-object p1, v0, Ldefpackage/fv0;->n:Ldefpackage/yu0;

    .line 97
    .line 98
    iput-object p2, v0, Ldefpackage/fv0;->o:Ldefpackage/jv0;

    .line 99
    .line 100
    iput v2, v0, Ldefpackage/fv0;->r:I

    .line 101
    .line 102
    invoke-virtual {v1, p2, v0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v4, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v4

    .line 109
    :cond_5
    move-object v0, p1

    .line 110
    move-object p1, p2

    .line 111
    :goto_3
    move-object p2, p1

    .line 112
    move-object p1, v0

    .line 113
    :cond_6
    iput-object p2, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 114
    .line 115
    iget-wide p0, p1, Ldefpackage/yu0;->a:J

    .line 116
    .line 117
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 118
    .line 119
    return-object p0
.end method

.method public static final v0(Ldefpackage/z64;Ldefpackage/zu0;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Ldefpackage/gv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldefpackage/gv0;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/gv0;->q:I

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
    iput v1, v0, Ldefpackage/gv0;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/gv0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ldefpackage/gv0;-><init>(Ldefpackage/z64;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldefpackage/gv0;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/gv0;->q:I

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
    iget-object p1, v0, Ldefpackage/gv0;->n:Ldefpackage/zu0;

    .line 36
    .line 37
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v4, Ldefpackage/kv0;

    .line 59
    .line 60
    invoke-direct {v4, p2}, Ldefpackage/kv0;-><init>(Ldefpackage/jv0;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Ldefpackage/gv0;->n:Ldefpackage/zu0;

    .line 64
    .line 65
    iput v3, v0, Ldefpackage/gv0;->q:I

    .line 66
    .line 67
    invoke-virtual {v1, v4, v0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 72
    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_1
    iput-object v2, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 77
    .line 78
    :cond_4
    iget-boolean p2, p0, Ldefpackage/cx2;->A:Z

    .line 79
    .line 80
    if-nez p2, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    iget-object p2, p0, Ldefpackage/z64;->W:Ldefpackage/na4;

    .line 84
    .line 85
    invoke-virtual {p2}, Ldefpackage/na4;->x()Ldefpackage/we0;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    new-instance v0, Ldefpackage/p;

    .line 90
    .line 91
    const/16 v1, 0x10

    .line 92
    .line 93
    invoke-direct {v0, p1, p0, v2, v1}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x3

    .line 97
    invoke-static {p2, v2, v2, v0, p0}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 98
    .line 99
    .line 100
    :goto_2
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 101
    .line 102
    return-object p0
.end method

.method public static z0(Ldefpackage/z64;Ldefpackage/on3;JJI)V
    .locals 3

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, Ldefpackage/z64;->Q:Ldefpackage/uu0;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p6, :cond_1

    .line 11
    .line 12
    new-instance p6, Ldefpackage/uu0;

    .line 13
    .line 14
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p6, Ldefpackage/uu0;->f:Ldefpackage/on3;

    .line 19
    .line 20
    const-wide v1, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p6, Ldefpackage/uu0;->g:J

    .line 26
    .line 27
    iput-boolean v0, p6, Ldefpackage/uu0;->h:Z

    .line 28
    .line 29
    iput-object p6, p0, Ldefpackage/z64;->Q:Ldefpackage/uu0;

    .line 30
    .line 31
    :cond_1
    iput-object p1, p6, Ldefpackage/uu0;->f:Ldefpackage/on3;

    .line 32
    .line 33
    iput-wide p2, p6, Ldefpackage/uu0;->g:J

    .line 34
    .line 35
    iget-object p1, p0, Ldefpackage/z64;->U:Ldefpackage/e20;

    .line 36
    .line 37
    iget-object p2, p0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Ldefpackage/e20;

    .line 42
    .line 43
    invoke-direct {p1, p2, v0}, Ldefpackage/e20;-><init>(Ldefpackage/hb3;I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ldefpackage/z64;->U:Ldefpackage/e20;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object p2, p1, Ldefpackage/e20;->p:Ljava/lang/Object;

    .line 50
    .line 51
    iput-wide p4, p1, Ldefpackage/e20;->o:J

    .line 52
    .line 53
    :goto_0
    iput-boolean v0, p6, Ldefpackage/uu0;->h:Z

    .line 54
    .line 55
    iput-object p6, p0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/z64;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 6
    .line 7
    instance-of v0, p0, Ldefpackage/su0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Ldefpackage/su0;

    .line 12
    .line 13
    iget-boolean p0, p0, Ldefpackage/su0;->h:Z

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p0, Ldefpackage/uu0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    instance-of v0, p0, Ldefpackage/tu0;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    :goto_0
    const-string p0, "waiting"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    instance-of p0, p0, Ldefpackage/vu0;

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    const-string p0, "recognized"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-string p0, "idle"

    .line 38
    .line 39
    return-object p0
.end method

.method public final A0(Ldefpackage/av0;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ldefpackage/yu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/z64;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ldefpackage/z64;->J:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/z64;->F0()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0, p1}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final B0()Ldefpackage/y00;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Events channel not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final C0()Ldefpackage/rm2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/z64;->T:Ldefpackage/rm2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final D0(Ldefpackage/on3;J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/z64;->M:J

    .line 2
    .line 3
    invoke-static {v0, v1, p2, p3}, Ldefpackage/g83;->e(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Ldefpackage/z64;->M:J

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/z64;->C0()Ldefpackage/rm2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Ldefpackage/xl;->e(Ldefpackage/rm2;Ldefpackage/on3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ldefpackage/xu0;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p1, v0, p2, p3}, Ldefpackage/xu0;-><init>(ZJ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, p1}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final E0(Ldefpackage/on3;Ldefpackage/on3;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/z64;->T:Ldefpackage/rm2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/rm2;

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ldefpackage/rm2;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/z64;->T:Ldefpackage/rm2;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ldefpackage/z64;->C0()Ldefpackage/rm2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, p1}, Ldefpackage/xl;->e(Ldefpackage/rm2;Ldefpackage/on3;)V

    .line 19
    .line 20
    .line 21
    iget-wide v0, p2, Ldefpackage/on3;->c:J

    .line 22
    .line 23
    invoke-static {v0, v1, p3, p4}, Ldefpackage/g83;->d(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    iget-object p4, p0, Ldefpackage/z64;->E:Ldefpackage/k2;

    .line 28
    .line 29
    iget p1, p1, Ldefpackage/on3;->i:I

    .line 30
    .line 31
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 p4, 0x2

    .line 35
    if-ne p1, p4, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    :goto_0
    if-nez p1, :cond_4

    .line 41
    .line 42
    iget-boolean p1, p0, Ldefpackage/z64;->J:Z

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 47
    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    const p1, 0x7fffffff

    .line 51
    .line 52
    .line 53
    const/4 p4, 0x6

    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {p1, p4, v0}, Ldefpackage/su3;->a(IILdefpackage/wv;)Ldefpackage/aw;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0}, Ldefpackage/z64;->F0()V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, Ldefpackage/yu0;

    .line 69
    .line 70
    invoke-direct {p1, p2, p3}, Ldefpackage/yu0;-><init>(J)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, p1}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_4
    return-void
.end method

.method public final F()Ldefpackage/hb3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final F0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/z64;->J:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-static {v0, v2, v1}, Ldefpackage/su3;->a(IILdefpackage/wv;)Ldefpackage/aw;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ldefpackage/z64;->H:Ldefpackage/aw;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Ldefpackage/hv0;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Ldefpackage/hv0;-><init>(Ldefpackage/z64;Ldefpackage/vd0;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v1, v1, v2, p0}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final G(Ldefpackage/ue1;Ldefpackage/ln3;)V
    .locals 20

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
    iget v3, v1, Ldefpackage/ue1;->o:I

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-boolean v4, v0, Ldefpackage/z64;->F:Z

    .line 14
    .line 15
    if-eqz v4, :cond_45

    .line 16
    .line 17
    iget-object v4, v0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    new-instance v4, Ldefpackage/ly1;

    .line 22
    .line 23
    invoke-direct {v4, v0}, Ldefpackage/ly1;-><init>(Ldefpackage/z64;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, v0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 27
    .line 28
    :cond_0
    iget-object v4, v0, Ldefpackage/z64;->O:Ldefpackage/jh1;

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    iget-object v4, v0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v5, Ldefpackage/jh1;

    .line 38
    .line 39
    invoke-direct {v5, v4}, Ldefpackage/jh1;-><init>(Ldefpackage/ih1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v5}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 43
    .line 44
    .line 45
    iput-object v5, v0, Ldefpackage/z64;->O:Ldefpackage/jh1;

    .line 46
    .line 47
    :cond_1
    iget-object v6, v0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 48
    .line 49
    if-eqz v6, :cond_45

    .line 50
    .line 51
    iget-object v0, v6, Ldefpackage/ly1;->n:Ldefpackage/z64;

    .line 52
    .line 53
    iget-object v4, v6, Ldefpackage/ly1;->s:Ldefpackage/wr1;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    iget-object v4, v6, Ldefpackage/ly1;->o:Ldefpackage/gy1;

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    new-instance v4, Ldefpackage/gy1;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    sget-object v7, Ldefpackage/fy1;->p:Ldefpackage/fy1;

    .line 68
    .line 69
    iput-object v7, v4, Ldefpackage/gy1;->j:Ldefpackage/fy1;

    .line 70
    .line 71
    iput-boolean v5, v4, Ldefpackage/gy1;->k:Z

    .line 72
    .line 73
    iput-boolean v5, v4, Ldefpackage/gy1;->l:Z

    .line 74
    .line 75
    iput-object v4, v6, Ldefpackage/ly1;->o:Ldefpackage/gy1;

    .line 76
    .line 77
    :cond_2
    iput-object v4, v6, Ldefpackage/ly1;->s:Ldefpackage/wr1;

    .line 78
    .line 79
    :cond_3
    iget-object v4, v6, Ldefpackage/ly1;->s:Ldefpackage/wr1;

    .line 80
    .line 81
    if-eqz v4, :cond_44

    .line 82
    .line 83
    instance-of v7, v4, Ldefpackage/gy1;

    .line 84
    .line 85
    const-wide v12, 0x7fffffffffffffffL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    const-wide/16 v14, 0x0

    .line 91
    .line 92
    sget-object v8, Ldefpackage/ln3;->n:Ldefpackage/ln3;

    .line 93
    .line 94
    const/4 v9, 0x1

    .line 95
    sget-object v10, Ldefpackage/ln3;->o:Ldefpackage/ln3;

    .line 96
    .line 97
    if-eqz v7, :cond_f

    .line 98
    .line 99
    check-cast v4, Ldefpackage/gy1;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_4

    .line 106
    .line 107
    goto/16 :goto_1b

    .line 108
    .line 109
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    move v11, v5

    .line 114
    :goto_0
    if-ge v11, v7, :cond_6

    .line 115
    .line 116
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v16

    .line 120
    check-cast v16, Ldefpackage/ey1;

    .line 121
    .line 122
    invoke-static/range {v16 .. v16}, Ldefpackage/zz1;->h(Ldefpackage/ey1;)Z

    .line 123
    .line 124
    .line 125
    move-result v16

    .line 126
    if-nez v16, :cond_5

    .line 127
    .line 128
    goto/16 :goto_1b

    .line 129
    .line 130
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_6
    invoke-static {v1}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    move-object v7, v1

    .line 138
    check-cast v7, Ldefpackage/ey1;

    .line 139
    .line 140
    iget-object v1, v4, Ldefpackage/gy1;->j:Ldefpackage/fy1;

    .line 141
    .line 142
    sget-object v11, Ldefpackage/ky1;->a:[I

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    aget v1, v11, v1

    .line 149
    .line 150
    sget-object v11, Ldefpackage/fy1;->o:Ldefpackage/fy1;

    .line 151
    .line 152
    sget-object v5, Ldefpackage/fy1;->n:Ldefpackage/fy1;

    .line 153
    .line 154
    if-ne v1, v9, :cond_a

    .line 155
    .line 156
    iget-object v0, v0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 157
    .line 158
    iget-object v1, v0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 159
    .line 160
    invoke-interface {v1}, Ldefpackage/a74;->a()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_9

    .line 165
    .line 166
    iget-object v0, v0, Ldefpackage/g74;->b:Ldefpackage/tb;

    .line 167
    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    invoke-virtual {v0}, Ldefpackage/tb;->e()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    goto :goto_1

    .line 175
    :cond_7
    const/4 v0, 0x0

    .line 176
    :goto_1
    if-eqz v0, :cond_8

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_8
    move-object v0, v5

    .line 180
    goto :goto_3

    .line 181
    :cond_9
    :goto_2
    move-object v0, v11

    .line 182
    goto :goto_3

    .line 183
    :cond_a
    iget-object v0, v4, Ldefpackage/gy1;->j:Ldefpackage/fy1;

    .line 184
    .line 185
    :goto_3
    iput-object v0, v4, Ldefpackage/gy1;->j:Ldefpackage/fy1;

    .line 186
    .line 187
    if-ne v2, v8, :cond_c

    .line 188
    .line 189
    if-ne v0, v11, :cond_b

    .line 190
    .line 191
    iput-boolean v9, v7, Ldefpackage/ey1;->i:Z

    .line 192
    .line 193
    iput-boolean v9, v4, Ldefpackage/gy1;->k:Z

    .line 194
    .line 195
    :cond_b
    iput-boolean v9, v4, Ldefpackage/gy1;->l:Z

    .line 196
    .line 197
    :cond_c
    if-ne v2, v10, :cond_45

    .line 198
    .line 199
    if-ne v0, v5, :cond_d

    .line 200
    .line 201
    iget-wide v8, v7, Ldefpackage/ey1;->a:J

    .line 202
    .line 203
    const-wide/16 v10, 0x0

    .line 204
    .line 205
    const/16 v12, 0xc

    .line 206
    .line 207
    invoke-static/range {v6 .. v12}, Ldefpackage/ly1;->c(Ldefpackage/ly1;Ldefpackage/ey1;JJI)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_d
    iget-boolean v0, v4, Ldefpackage/gy1;->k:Z

    .line 212
    .line 213
    if-eqz v0, :cond_45

    .line 214
    .line 215
    new-instance v9, Ldefpackage/dy1;

    .line 216
    .line 217
    invoke-direct {v9, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 218
    .line 219
    .line 220
    const-wide/16 v10, 0x0

    .line 221
    .line 222
    move-object v8, v7

    .line 223
    invoke-virtual/range {v6 .. v11}, Ldefpackage/ly1;->f(Ldefpackage/ey1;Ldefpackage/ey1;Ldefpackage/dy1;J)V

    .line 224
    .line 225
    .line 226
    new-instance v0, Ldefpackage/dy1;

    .line 227
    .line 228
    invoke-direct {v0, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v7, v0, v14, v15}, Ldefpackage/ly1;->e(Ldefpackage/ey1;Ldefpackage/dy1;J)V

    .line 232
    .line 233
    .line 234
    iget-wide v0, v7, Ldefpackage/ey1;->a:J

    .line 235
    .line 236
    iget-object v2, v6, Ldefpackage/ly1;->p:Ldefpackage/jy1;

    .line 237
    .line 238
    if-nez v2, :cond_e

    .line 239
    .line 240
    new-instance v2, Ldefpackage/jy1;

    .line 241
    .line 242
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 243
    .line 244
    .line 245
    iput-wide v12, v2, Ldefpackage/jy1;->j:J

    .line 246
    .line 247
    iput-object v2, v6, Ldefpackage/ly1;->p:Ldefpackage/jy1;

    .line 248
    .line 249
    :cond_e
    iput-wide v0, v2, Ldefpackage/jy1;->j:J

    .line 250
    .line 251
    iput-object v2, v6, Ldefpackage/ly1;->s:Ldefpackage/wr1;

    .line 252
    .line 253
    return-void

    .line 254
    :cond_f
    instance-of v5, v4, Ldefpackage/iy1;

    .line 255
    .line 256
    sget-object v7, Ldefpackage/ln3;->p:Ldefpackage/ln3;

    .line 257
    .line 258
    if-eqz v5, :cond_25

    .line 259
    .line 260
    check-cast v4, Ldefpackage/iy1;

    .line 261
    .line 262
    if-ne v2, v8, :cond_10

    .line 263
    .line 264
    goto/16 :goto_1b

    .line 265
    .line 266
    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    const/4 v8, 0x0

    .line 271
    :goto_4
    if-ge v8, v5, :cond_12

    .line 272
    .line 273
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    move-object v15, v14

    .line 278
    check-cast v15, Ldefpackage/ey1;

    .line 279
    .line 280
    iget-wide v11, v15, Ldefpackage/ey1;->a:J

    .line 281
    .line 282
    move-object/from16 v18, v10

    .line 283
    .line 284
    iget-wide v9, v4, Ldefpackage/iy1;->k:J

    .line 285
    .line 286
    invoke-static {v11, v12, v9, v10}, Ldefpackage/vr1;->n(JJ)Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_11

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 294
    .line 295
    move-object/from16 v10, v18

    .line 296
    .line 297
    const/4 v9, 0x1

    .line 298
    const-wide v12, 0x7fffffffffffffffL

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_12
    move-object/from16 v18, v10

    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    :goto_5
    check-cast v14, Ldefpackage/ey1;

    .line 308
    .line 309
    if-nez v14, :cond_16

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    const/4 v8, 0x0

    .line 316
    :goto_6
    if-ge v8, v5, :cond_14

    .line 317
    .line 318
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    move-object v10, v9

    .line 323
    check-cast v10, Ldefpackage/ey1;

    .line 324
    .line 325
    iget-boolean v10, v10, Ldefpackage/ey1;->d:Z

    .line 326
    .line 327
    if-eqz v10, :cond_13

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_14
    const/4 v9, 0x0

    .line 334
    :goto_7
    move-object v14, v9

    .line 335
    check-cast v14, Ldefpackage/ey1;

    .line 336
    .line 337
    if-nez v14, :cond_15

    .line 338
    .line 339
    invoke-virtual {v6}, Ldefpackage/ly1;->a()V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_15
    iget-wide v8, v14, Ldefpackage/ey1;->a:J

    .line 344
    .line 345
    iput-wide v8, v4, Ldefpackage/iy1;->k:J

    .line 346
    .line 347
    :cond_16
    move-object v8, v14

    .line 348
    const-string v5, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 349
    .line 350
    const-string v12, "AwaitTouchSlop.initialDown was not initialized"

    .line 351
    .line 352
    move-object/from16 v9, v18

    .line 353
    .line 354
    if-ne v2, v9, :cond_19

    .line 355
    .line 356
    iget-boolean v9, v8, Ldefpackage/ey1;->i:Z

    .line 357
    .line 358
    if-nez v9, :cond_1f

    .line 359
    .line 360
    invoke-static {v8}, Ldefpackage/zz1;->b(Ldefpackage/ey1;)Z

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    if-eqz v9, :cond_1b

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    const/4 v3, 0x0

    .line 371
    :goto_8
    if-ge v3, v0, :cond_18

    .line 372
    .line 373
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v9

    .line 377
    move-object v10, v9

    .line 378
    check-cast v10, Ldefpackage/ey1;

    .line 379
    .line 380
    iget-boolean v10, v10, Ldefpackage/ey1;->d:Z

    .line 381
    .line 382
    if-eqz v10, :cond_17

    .line 383
    .line 384
    move-object v11, v9

    .line 385
    goto :goto_9

    .line 386
    :cond_17
    add-int/lit8 v3, v3, 0x1

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_18
    const/4 v11, 0x0

    .line 390
    :goto_9
    check-cast v11, Ldefpackage/ey1;

    .line 391
    .line 392
    if-nez v11, :cond_1a

    .line 393
    .line 394
    invoke-virtual {v6}, Ldefpackage/ly1;->a()V

    .line 395
    .line 396
    .line 397
    :cond_19
    :goto_a
    move-object v0, v7

    .line 398
    goto/16 :goto_b

    .line 399
    .line 400
    :cond_1a
    iget-wide v0, v11, Ldefpackage/ey1;->a:J

    .line 401
    .line 402
    iput-wide v0, v4, Ldefpackage/iy1;->k:J

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_1b
    sget-object v1, Ldefpackage/g90;->t:Ldefpackage/wl4;

    .line 406
    .line 407
    invoke-static {v0, v1}, Ldefpackage/kb4;->q(Ldefpackage/a90;Ldefpackage/qr3;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, Ldefpackage/m65;

    .line 412
    .line 413
    sget v9, Ldefpackage/bv0;->a:F

    .line 414
    .line 415
    invoke-interface {v1}, Ldefpackage/m65;->c()F

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    iget-object v9, v6, Ldefpackage/ly1;->u:Ldefpackage/e20;

    .line 420
    .line 421
    if-eqz v9, :cond_1e

    .line 422
    .line 423
    iget-object v0, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 424
    .line 425
    new-instance v10, Ldefpackage/dy1;

    .line 426
    .line 427
    invoke-direct {v10, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 428
    .line 429
    .line 430
    const/4 v13, 0x1

    .line 431
    invoke-static {v8, v0, v10, v13}, Ldefpackage/zz1;->A(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;Z)J

    .line 432
    .line 433
    .line 434
    move-result-wide v10

    .line 435
    invoke-static {v9, v10, v11, v1}, Ldefpackage/e20;->u(Ldefpackage/e20;JF)J

    .line 436
    .line 437
    .line 438
    move-result-wide v10

    .line 439
    const-wide v0, 0x7fffffff7fffffffL

    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    and-long/2addr v0, v10

    .line 445
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    cmp-long v0, v0, v14

    .line 451
    .line 452
    if-eqz v0, :cond_1d

    .line 453
    .line 454
    iput-boolean v13, v8, Ldefpackage/ey1;->i:Z

    .line 455
    .line 456
    move-object v0, v7

    .line 457
    iget-object v7, v4, Ldefpackage/iy1;->j:Ldefpackage/ey1;

    .line 458
    .line 459
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    new-instance v9, Ldefpackage/dy1;

    .line 463
    .line 464
    invoke-direct {v9, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v6 .. v11}, Ldefpackage/ly1;->f(Ldefpackage/ey1;Ldefpackage/ey1;Ldefpackage/dy1;J)V

    .line 468
    .line 469
    .line 470
    new-instance v1, Ldefpackage/dy1;

    .line 471
    .line 472
    invoke-direct {v1, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v6, v8, v1, v10, v11}, Ldefpackage/ly1;->e(Ldefpackage/ey1;Ldefpackage/dy1;J)V

    .line 476
    .line 477
    .line 478
    iget-wide v9, v8, Ldefpackage/ey1;->a:J

    .line 479
    .line 480
    iget-object v1, v6, Ldefpackage/ly1;->p:Ldefpackage/jy1;

    .line 481
    .line 482
    if-nez v1, :cond_1c

    .line 483
    .line 484
    new-instance v1, Ldefpackage/jy1;

    .line 485
    .line 486
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 487
    .line 488
    .line 489
    const-wide v13, 0x7fffffffffffffffL

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    iput-wide v13, v1, Ldefpackage/jy1;->j:J

    .line 495
    .line 496
    iput-object v1, v6, Ldefpackage/ly1;->p:Ldefpackage/jy1;

    .line 497
    .line 498
    :cond_1c
    iput-wide v9, v1, Ldefpackage/jy1;->j:J

    .line 499
    .line 500
    iput-object v1, v6, Ldefpackage/ly1;->s:Ldefpackage/wr1;

    .line 501
    .line 502
    goto :goto_b

    .line 503
    :cond_1d
    move-object v0, v7

    .line 504
    iput-boolean v13, v4, Ldefpackage/iy1;->l:Z

    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_1e
    const-string v0, "Touch slop detector not initialized."

    .line 508
    .line 509
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :cond_1f
    move-object v0, v7

    .line 514
    iget-object v1, v4, Ldefpackage/iy1;->j:Ldefpackage/ey1;

    .line 515
    .line 516
    if-eqz v1, :cond_21

    .line 517
    .line 518
    iget-wide v9, v4, Ldefpackage/iy1;->k:J

    .line 519
    .line 520
    iget-object v3, v6, Ldefpackage/ly1;->u:Ldefpackage/e20;

    .line 521
    .line 522
    if-eqz v3, :cond_20

    .line 523
    .line 524
    invoke-virtual {v6, v1, v9, v10, v3}, Ldefpackage/ly1;->b(Ldefpackage/ey1;JLdefpackage/e20;)V

    .line 525
    .line 526
    .line 527
    goto :goto_b

    .line 528
    :cond_20
    invoke-static {v5}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :cond_21
    invoke-static {v12}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :goto_b
    if-ne v2, v0, :cond_45

    .line 537
    .line 538
    iget-boolean v0, v4, Ldefpackage/iy1;->l:Z

    .line 539
    .line 540
    if-eqz v0, :cond_45

    .line 541
    .line 542
    iget-boolean v0, v8, Ldefpackage/ey1;->i:Z

    .line 543
    .line 544
    if-eqz v0, :cond_24

    .line 545
    .line 546
    iget-object v0, v4, Ldefpackage/iy1;->j:Ldefpackage/ey1;

    .line 547
    .line 548
    if-eqz v0, :cond_23

    .line 549
    .line 550
    iget-wide v1, v4, Ldefpackage/iy1;->k:J

    .line 551
    .line 552
    iget-object v3, v6, Ldefpackage/ly1;->u:Ldefpackage/e20;

    .line 553
    .line 554
    if-eqz v3, :cond_22

    .line 555
    .line 556
    invoke-virtual {v6, v0, v1, v2, v3}, Ldefpackage/ly1;->b(Ldefpackage/ey1;JLdefpackage/e20;)V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :cond_22
    invoke-static {v5}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    return-void

    .line 564
    :cond_23
    invoke-static {v12}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    return-void

    .line 568
    :cond_24
    const/4 v0, 0x0

    .line 569
    iput-boolean v0, v4, Ldefpackage/iy1;->l:Z

    .line 570
    .line 571
    return-void

    .line 572
    :cond_25
    move-object v5, v7

    .line 573
    move-object v9, v10

    .line 574
    instance-of v7, v4, Ldefpackage/hy1;

    .line 575
    .line 576
    if-eqz v7, :cond_2d

    .line 577
    .line 578
    check-cast v4, Ldefpackage/hy1;

    .line 579
    .line 580
    if-eq v2, v5, :cond_26

    .line 581
    .line 582
    goto/16 :goto_1b

    .line 583
    .line 584
    :cond_26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    const/4 v5, 0x0

    .line 589
    :goto_c
    if-ge v5, v2, :cond_28

    .line 590
    .line 591
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v7

    .line 595
    check-cast v7, Ldefpackage/ey1;

    .line 596
    .line 597
    iget-boolean v7, v7, Ldefpackage/ey1;->i:Z

    .line 598
    .line 599
    if-eqz v7, :cond_27

    .line 600
    .line 601
    const/4 v9, 0x0

    .line 602
    goto :goto_d

    .line 603
    :cond_27
    add-int/lit8 v5, v5, 0x1

    .line 604
    .line 605
    goto :goto_c

    .line 606
    :cond_28
    const/4 v9, 0x1

    .line 607
    :goto_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    const/4 v5, 0x0

    .line 612
    :goto_e
    if-ge v5, v2, :cond_2c

    .line 613
    .line 614
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    check-cast v7, Ldefpackage/ey1;

    .line 619
    .line 620
    iget-boolean v7, v7, Ldefpackage/ey1;->d:Z

    .line 621
    .line 622
    if-eqz v7, :cond_2b

    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    if-eqz v2, :cond_29

    .line 629
    .line 630
    goto :goto_f

    .line 631
    :cond_29
    if-eqz v9, :cond_45

    .line 632
    .line 633
    invoke-static {v1}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    check-cast v1, Ldefpackage/ey1;

    .line 638
    .line 639
    iget-object v2, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 640
    .line 641
    new-instance v5, Ldefpackage/dy1;

    .line 642
    .line 643
    invoke-direct {v5, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 644
    .line 645
    .line 646
    invoke-static {v1, v2, v5}, Ldefpackage/zz1;->B(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;)J

    .line 647
    .line 648
    .line 649
    move-result-wide v1

    .line 650
    iget-object v5, v4, Ldefpackage/hy1;->j:Ldefpackage/ey1;

    .line 651
    .line 652
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    iget-object v0, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 656
    .line 657
    new-instance v7, Ldefpackage/dy1;

    .line 658
    .line 659
    invoke-direct {v7, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 660
    .line 661
    .line 662
    invoke-static {v5, v0, v7}, Ldefpackage/zz1;->B(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;)J

    .line 663
    .line 664
    .line 665
    move-result-wide v7

    .line 666
    invoke-static {v1, v2, v7, v8}, Ldefpackage/g83;->d(JJ)J

    .line 667
    .line 668
    .line 669
    move-result-wide v10

    .line 670
    iget-object v7, v4, Ldefpackage/hy1;->j:Ldefpackage/ey1;

    .line 671
    .line 672
    if-eqz v7, :cond_2a

    .line 673
    .line 674
    iget-wide v8, v4, Ldefpackage/hy1;->k:J

    .line 675
    .line 676
    const/16 v12, 0x8

    .line 677
    .line 678
    invoke-static/range {v6 .. v12}, Ldefpackage/ly1;->c(Ldefpackage/ly1;Ldefpackage/ey1;JJI)V

    .line 679
    .line 680
    .line 681
    return-void

    .line 682
    :cond_2a
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 683
    .line 684
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    return-void

    .line 688
    :cond_2b
    add-int/lit8 v5, v5, 0x1

    .line 689
    .line 690
    goto :goto_e

    .line 691
    :cond_2c
    :goto_f
    invoke-virtual {v6}, Ldefpackage/ly1;->a()V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :cond_2d
    instance-of v5, v4, Ldefpackage/jy1;

    .line 696
    .line 697
    if-eqz v5, :cond_43

    .line 698
    .line 699
    check-cast v4, Ldefpackage/jy1;

    .line 700
    .line 701
    if-eq v2, v9, :cond_2e

    .line 702
    .line 703
    goto/16 :goto_1b

    .line 704
    .line 705
    :cond_2e
    iget-wide v7, v4, Ldefpackage/jy1;->j:J

    .line 706
    .line 707
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    const/4 v5, 0x0

    .line 712
    :goto_10
    if-ge v5, v2, :cond_30

    .line 713
    .line 714
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v9

    .line 718
    move-object v10, v9

    .line 719
    check-cast v10, Ldefpackage/ey1;

    .line 720
    .line 721
    iget-wide v10, v10, Ldefpackage/ey1;->a:J

    .line 722
    .line 723
    invoke-static {v10, v11, v7, v8}, Ldefpackage/vr1;->n(JJ)Z

    .line 724
    .line 725
    .line 726
    move-result v10

    .line 727
    if-eqz v10, :cond_2f

    .line 728
    .line 729
    goto :goto_11

    .line 730
    :cond_2f
    add-int/lit8 v5, v5, 0x1

    .line 731
    .line 732
    goto :goto_10

    .line 733
    :cond_30
    const/4 v9, 0x0

    .line 734
    :goto_11
    check-cast v9, Ldefpackage/ey1;

    .line 735
    .line 736
    if-nez v9, :cond_31

    .line 737
    .line 738
    goto/16 :goto_1b

    .line 739
    .line 740
    :cond_31
    iget-wide v7, v9, Ldefpackage/ey1;->c:J

    .line 741
    .line 742
    invoke-static {v9}, Ldefpackage/zz1;->b(Ldefpackage/ey1;)Z

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    sget-object v5, Ldefpackage/wu0;->a:Ldefpackage/wu0;

    .line 747
    .line 748
    if-eqz v2, :cond_40

    .line 749
    .line 750
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    const/4 v11, 0x0

    .line 755
    :goto_12
    if-ge v11, v2, :cond_33

    .line 756
    .line 757
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v12

    .line 761
    const/16 p2, 0x0

    .line 762
    .line 763
    move-object v10, v12

    .line 764
    check-cast v10, Ldefpackage/ey1;

    .line 765
    .line 766
    iget-boolean v10, v10, Ldefpackage/ey1;->d:Z

    .line 767
    .line 768
    if-eqz v10, :cond_32

    .line 769
    .line 770
    goto :goto_13

    .line 771
    :cond_32
    add-int/lit8 v11, v11, 0x1

    .line 772
    .line 773
    goto :goto_12

    .line 774
    :cond_33
    const/16 p2, 0x0

    .line 775
    .line 776
    const/4 v12, 0x0

    .line 777
    :goto_13
    check-cast v12, Ldefpackage/ey1;

    .line 778
    .line 779
    if-nez v12, :cond_3f

    .line 780
    .line 781
    iget-boolean v1, v9, Ldefpackage/ey1;->i:Z

    .line 782
    .line 783
    if-nez v1, :cond_3e

    .line 784
    .line 785
    invoke-static {v9}, Ldefpackage/zz1;->b(Ldefpackage/ey1;)Z

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    if-eqz v1, :cond_3e

    .line 790
    .line 791
    invoke-virtual {v6}, Ldefpackage/ly1;->d()Ldefpackage/rm2;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    iget-object v2, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 796
    .line 797
    iget-object v4, v6, Ldefpackage/ly1;->v:Ldefpackage/x7;

    .line 798
    .line 799
    iget-object v5, v4, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v5, Ldefpackage/q03;

    .line 802
    .line 803
    const/16 v10, 0x20

    .line 804
    .line 805
    shr-long v11, v7, v10

    .line 806
    .line 807
    long-to-int v11, v11

    .line 808
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 809
    .line 810
    .line 811
    move-result v11

    .line 812
    const-wide v16, 0xffffffffL

    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    and-long v7, v7, v16

    .line 818
    .line 819
    long-to-int v7, v7

    .line 820
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    invoke-static {v9}, Ldefpackage/zz1;->h(Ldefpackage/ey1;)Z

    .line 825
    .line 826
    .line 827
    move-result v8

    .line 828
    if-eqz v8, :cond_34

    .line 829
    .line 830
    const/4 v8, 0x0

    .line 831
    iput v8, v4, Ldefpackage/x7;->o:I

    .line 832
    .line 833
    invoke-virtual {v5}, Ldefpackage/q03;->d()V

    .line 834
    .line 835
    .line 836
    :cond_34
    invoke-static {v9}, Ldefpackage/zz1;->b(Ldefpackage/ey1;)Z

    .line 837
    .line 838
    .line 839
    move-result v8

    .line 840
    if-nez v8, :cond_39

    .line 841
    .line 842
    invoke-static {v9}, Ldefpackage/zz1;->h(Ldefpackage/ey1;)Z

    .line 843
    .line 844
    .line 845
    move-result v8

    .line 846
    if-nez v8, :cond_39

    .line 847
    .line 848
    iget v7, v5, Ldefpackage/q03;->b:I

    .line 849
    .line 850
    const/4 v8, 0x3

    .line 851
    if-ne v7, v8, :cond_35

    .line 852
    .line 853
    iget v7, v4, Ldefpackage/x7;->o:I

    .line 854
    .line 855
    add-int/lit8 v11, v7, 0x1

    .line 856
    .line 857
    iput v11, v4, Ldefpackage/x7;->o:I

    .line 858
    .line 859
    invoke-virtual {v5, v7, v9}, Ldefpackage/q03;->n(ILjava/lang/Object;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    goto :goto_14

    .line 863
    :cond_35
    invoke-virtual {v5, v9}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    :goto_14
    iget v7, v4, Ldefpackage/x7;->o:I

    .line 867
    .line 868
    if-ne v7, v8, :cond_36

    .line 869
    .line 870
    const/4 v8, 0x0

    .line 871
    iput v8, v4, Ldefpackage/x7;->o:I

    .line 872
    .line 873
    :cond_36
    iget-object v4, v5, Ldefpackage/q03;->a:[Ljava/lang/Object;

    .line 874
    .line 875
    iget v7, v5, Ldefpackage/q03;->b:I

    .line 876
    .line 877
    move/from16 v11, p2

    .line 878
    .line 879
    const/4 v8, 0x0

    .line 880
    :goto_15
    if-ge v8, v7, :cond_37

    .line 881
    .line 882
    aget-object v12, v4, v8

    .line 883
    .line 884
    check-cast v12, Ldefpackage/ey1;

    .line 885
    .line 886
    move/from16 v18, v10

    .line 887
    .line 888
    move/from16 v19, v11

    .line 889
    .line 890
    iget-wide v10, v12, Ldefpackage/ey1;->c:J

    .line 891
    .line 892
    shr-long v10, v10, v18

    .line 893
    .line 894
    long-to-int v10, v10

    .line 895
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 896
    .line 897
    .line 898
    move-result v10

    .line 899
    add-float v11, v10, v19

    .line 900
    .line 901
    add-int/lit8 v8, v8, 0x1

    .line 902
    .line 903
    move/from16 v10, v18

    .line 904
    .line 905
    goto :goto_15

    .line 906
    :cond_37
    move/from16 v18, v10

    .line 907
    .line 908
    move/from16 v19, v11

    .line 909
    .line 910
    iget v4, v5, Ldefpackage/q03;->b:I

    .line 911
    .line 912
    int-to-float v7, v4

    .line 913
    div-float v11, v19, v7

    .line 914
    .line 915
    iget-object v7, v5, Ldefpackage/q03;->a:[Ljava/lang/Object;

    .line 916
    .line 917
    move/from16 v10, p2

    .line 918
    .line 919
    const/4 v8, 0x0

    .line 920
    :goto_16
    if-ge v8, v4, :cond_38

    .line 921
    .line 922
    aget-object v12, v7, v8

    .line 923
    .line 924
    check-cast v12, Ldefpackage/ey1;

    .line 925
    .line 926
    iget-wide v13, v12, Ldefpackage/ey1;->c:J

    .line 927
    .line 928
    and-long v12, v13, v16

    .line 929
    .line 930
    long-to-int v12, v12

    .line 931
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 932
    .line 933
    .line 934
    move-result v12

    .line 935
    add-float/2addr v10, v12

    .line 936
    add-int/lit8 v8, v8, 0x1

    .line 937
    .line 938
    const-wide/16 v14, 0x0

    .line 939
    .line 940
    goto :goto_16

    .line 941
    :cond_38
    iget v4, v5, Ldefpackage/q03;->b:I

    .line 942
    .line 943
    int-to-float v4, v4

    .line 944
    div-float v7, v10, v4

    .line 945
    .line 946
    goto :goto_17

    .line 947
    :cond_39
    move/from16 v18, v10

    .line 948
    .line 949
    :goto_17
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 950
    .line 951
    .line 952
    move-result v4

    .line 953
    int-to-long v4, v4

    .line 954
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 955
    .line 956
    .line 957
    move-result v7

    .line 958
    int-to-long v7, v7

    .line 959
    shl-long v4, v4, v18

    .line 960
    .line 961
    and-long v7, v7, v16

    .line 962
    .line 963
    or-long/2addr v4, v7

    .line 964
    if-nez v2, :cond_3a

    .line 965
    .line 966
    goto :goto_19

    .line 967
    :cond_3a
    const/4 v13, 0x1

    .line 968
    if-ne v3, v13, :cond_3b

    .line 969
    .line 970
    shr-long v3, v4, v18

    .line 971
    .line 972
    long-to-int v3, v3

    .line 973
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    goto :goto_18

    .line 978
    :cond_3b
    const/4 v7, 0x2

    .line 979
    if-ne v3, v7, :cond_3d

    .line 980
    .line 981
    and-long v3, v4, v16

    .line 982
    .line 983
    long-to-int v3, v3

    .line 984
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    :goto_18
    sget-object v4, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 989
    .line 990
    if-ne v2, v4, :cond_3c

    .line 991
    .line 992
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 993
    .line 994
    .line 995
    move-result v2

    .line 996
    int-to-long v2, v2

    .line 997
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    int-to-long v4, v4

    .line 1002
    shl-long v2, v2, v18

    .line 1003
    .line 1004
    and-long v4, v4, v16

    .line 1005
    .line 1006
    or-long/2addr v4, v2

    .line 1007
    goto :goto_19

    .line 1008
    :cond_3c
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1009
    .line 1010
    .line 1011
    move-result v2

    .line 1012
    int-to-long v4, v2

    .line 1013
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1014
    .line 1015
    .line 1016
    move-result v2

    .line 1017
    int-to-long v2, v2

    .line 1018
    shl-long v4, v4, v18

    .line 1019
    .line 1020
    and-long v2, v2, v16

    .line 1021
    .line 1022
    or-long/2addr v4, v2

    .line 1023
    :cond_3d
    :goto_19
    iget-wide v2, v9, Ldefpackage/ey1;->b:J

    .line 1024
    .line 1025
    iget-object v1, v1, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v1, Ldefpackage/qf2;

    .line 1028
    .line 1029
    invoke-virtual {v1, v2, v3, v4, v5}, Ldefpackage/qf2;->a(JJ)V

    .line 1030
    .line 1031
    .line 1032
    sget-object v1, Ldefpackage/g90;->t:Ldefpackage/wl4;

    .line 1033
    .line 1034
    invoke-static {v0, v1}, Ldefpackage/kb4;->q(Ldefpackage/a90;Ldefpackage/qr3;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    check-cast v1, Ldefpackage/m65;

    .line 1039
    .line 1040
    invoke-interface {v1}, Ldefpackage/m65;->b()F

    .line 1041
    .line 1042
    .line 1043
    move-result v1

    .line 1044
    invoke-virtual {v6}, Ldefpackage/ly1;->d()Ldefpackage/rm2;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    invoke-static {v1, v1}, Ldefpackage/e35;->h(FF)J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v3

    .line 1052
    invoke-virtual {v2, v3, v4}, Ldefpackage/rm2;->c(J)J

    .line 1053
    .line 1054
    .line 1055
    move-result-wide v1

    .line 1056
    invoke-virtual {v6}, Ldefpackage/ly1;->d()Ldefpackage/rm2;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v3

    .line 1060
    iget-object v3, v3, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 1061
    .line 1062
    check-cast v3, Ldefpackage/qf2;

    .line 1063
    .line 1064
    iget-object v4, v3, Ldefpackage/qf2;->a:Ldefpackage/m45;

    .line 1065
    .line 1066
    iget-object v5, v4, Ldefpackage/m45;->d:[Ldefpackage/vh0;

    .line 1067
    .line 1068
    const/4 v7, 0x0

    .line 1069
    invoke-static {v5, v7}, Ldefpackage/ti;->h0([Ljava/lang/Object;Ldefpackage/f01;)V

    .line 1070
    .line 1071
    .line 1072
    const/4 v8, 0x0

    .line 1073
    iput v8, v4, Ldefpackage/m45;->e:I

    .line 1074
    .line 1075
    iget-object v4, v3, Ldefpackage/qf2;->b:Ldefpackage/m45;

    .line 1076
    .line 1077
    iget-object v5, v4, Ldefpackage/m45;->d:[Ldefpackage/vh0;

    .line 1078
    .line 1079
    invoke-static {v5, v7}, Ldefpackage/ti;->h0([Ljava/lang/Object;Ldefpackage/f01;)V

    .line 1080
    .line 1081
    .line 1082
    iput v8, v4, Ldefpackage/m45;->e:I

    .line 1083
    .line 1084
    const-wide/16 v4, 0x0

    .line 1085
    .line 1086
    iput-wide v4, v3, Ldefpackage/qf2;->c:J

    .line 1087
    .line 1088
    new-instance v3, Ldefpackage/zu0;

    .line 1089
    .line 1090
    invoke-static {v1, v2}, Ldefpackage/ov0;->a(J)J

    .line 1091
    .line 1092
    .line 1093
    move-result-wide v1

    .line 1094
    const/4 v13, 0x1

    .line 1095
    invoke-direct {v3, v13, v1, v2}, Ldefpackage/zu0;-><init>(ZJ)V

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v0, v3}, Ldefpackage/z64;->A0(Ldefpackage/av0;)V

    .line 1099
    .line 1100
    .line 1101
    goto :goto_1a

    .line 1102
    :cond_3e
    invoke-virtual {v0, v5}, Ldefpackage/z64;->A0(Ldefpackage/av0;)V

    .line 1103
    .line 1104
    .line 1105
    :goto_1a
    invoke-virtual {v6}, Ldefpackage/ly1;->a()V

    .line 1106
    .line 1107
    .line 1108
    return-void

    .line 1109
    :cond_3f
    iget-wide v0, v12, Ldefpackage/ey1;->a:J

    .line 1110
    .line 1111
    iput-wide v0, v4, Ldefpackage/jy1;->j:J

    .line 1112
    .line 1113
    return-void

    .line 1114
    :cond_40
    const/16 p2, 0x0

    .line 1115
    .line 1116
    iget-boolean v1, v9, Ldefpackage/ey1;->i:Z

    .line 1117
    .line 1118
    if-eqz v1, :cond_41

    .line 1119
    .line 1120
    invoke-virtual {v0, v5}, Ldefpackage/z64;->A0(Ldefpackage/av0;)V

    .line 1121
    .line 1122
    .line 1123
    return-void

    .line 1124
    :cond_41
    iget-object v1, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 1125
    .line 1126
    new-instance v2, Ldefpackage/dy1;

    .line 1127
    .line 1128
    invoke-direct {v2, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 1129
    .line 1130
    .line 1131
    const/4 v13, 0x1

    .line 1132
    invoke-static {v9, v1, v2, v13}, Ldefpackage/zz1;->A(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;Z)J

    .line 1133
    .line 1134
    .line 1135
    move-result-wide v1

    .line 1136
    invoke-static {v1, v2}, Ldefpackage/g83;->c(J)F

    .line 1137
    .line 1138
    .line 1139
    move-result v1

    .line 1140
    cmpg-float v1, v1, p2

    .line 1141
    .line 1142
    if-nez v1, :cond_42

    .line 1143
    .line 1144
    goto :goto_1b

    .line 1145
    :cond_42
    iget-object v0, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 1146
    .line 1147
    new-instance v1, Ldefpackage/dy1;

    .line 1148
    .line 1149
    invoke-direct {v1, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 1150
    .line 1151
    .line 1152
    const/4 v8, 0x0

    .line 1153
    invoke-static {v9, v0, v1, v8}, Ldefpackage/zz1;->A(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;Z)J

    .line 1154
    .line 1155
    .line 1156
    move-result-wide v0

    .line 1157
    new-instance v2, Ldefpackage/dy1;

    .line 1158
    .line 1159
    invoke-direct {v2, v3}, Ldefpackage/dy1;-><init>(I)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v6, v9, v2, v0, v1}, Ldefpackage/ly1;->e(Ldefpackage/ey1;Ldefpackage/dy1;J)V

    .line 1163
    .line 1164
    .line 1165
    const/4 v13, 0x1

    .line 1166
    iput-boolean v13, v9, Ldefpackage/ey1;->i:Z

    .line 1167
    .line 1168
    return-void

    .line 1169
    :cond_43
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 1170
    .line 1171
    .line 1172
    return-void

    .line 1173
    :cond_44
    const-string v0, "currentDragState should not be null"

    .line 1174
    .line 1175
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    :cond_45
    :goto_1b
    return-void
.end method

.method public final G0(Ldefpackage/tb;Ldefpackage/fv;Ldefpackage/y71;Ldefpackage/rm2;Ldefpackage/hb3;Ldefpackage/a74;ZZ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldefpackage/z64;->F:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p7, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/z64;->f0:Ldefpackage/xk0;

    .line 7
    .line 8
    iput-boolean p7, v0, Ldefpackage/xk0;->o:Z

    .line 9
    .line 10
    iput-object v1, p0, Ldefpackage/z64;->X:Ldefpackage/z;

    .line 11
    .line 12
    iput-object v1, p0, Ldefpackage/z64;->Y:Ldefpackage/j2;

    .line 13
    .line 14
    invoke-static {p0}, Ldefpackage/fu;->C(Ldefpackage/g94;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-nez p3, :cond_1

    .line 18
    .line 19
    iget-object p3, p0, Ldefpackage/z64;->d0:Ldefpackage/uk0;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 22
    .line 23
    iget-object v2, v0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 24
    .line 25
    invoke-static {v2, p6}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x1

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    iput-object p6, v0, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 34
    .line 35
    move p6, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move p6, v3

    .line 38
    :goto_0
    iput-object p1, v0, Ldefpackage/g74;->b:Ldefpackage/tb;

    .line 39
    .line 40
    iget-object p1, v0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 41
    .line 42
    if-eq p1, p5, :cond_3

    .line 43
    .line 44
    iput-object p5, v0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 45
    .line 46
    move p6, v4

    .line 47
    :cond_3
    iget-boolean p1, v0, Ldefpackage/g74;->e:Z

    .line 48
    .line 49
    if-eq p1, p8, :cond_4

    .line 50
    .line 51
    iput-boolean p8, v0, Ldefpackage/g74;->e:Z

    .line 52
    .line 53
    move p6, v4

    .line 54
    :cond_4
    iput-object p3, v0, Ldefpackage/g74;->c:Ldefpackage/y71;

    .line 55
    .line 56
    iget-object p1, p0, Ldefpackage/z64;->W:Ldefpackage/na4;

    .line 57
    .line 58
    iput-object p1, v0, Ldefpackage/g74;->f:Ldefpackage/na4;

    .line 59
    .line 60
    iget-object p1, p0, Ldefpackage/z64;->h0:Ldefpackage/gd0;

    .line 61
    .line 62
    iput-object p5, p1, Ldefpackage/gd0;->B:Ldefpackage/hb3;

    .line 63
    .line 64
    iput-boolean p8, p1, Ldefpackage/gd0;->D:Z

    .line 65
    .line 66
    iput-object p2, p1, Ldefpackage/gd0;->E:Ldefpackage/fv;

    .line 67
    .line 68
    sget-object p1, Ldefpackage/uo;->p:Ldefpackage/k2;

    .line 69
    .line 70
    iget-object p2, v0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 71
    .line 72
    sget-object p3, Ldefpackage/hb3;->n:Ldefpackage/hb3;

    .line 73
    .line 74
    if-ne p2, p3, :cond_5

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    sget-object p3, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 78
    .line 79
    :goto_1
    iput-object p1, p0, Ldefpackage/z64;->E:Ldefpackage/k2;

    .line 80
    .line 81
    iget-boolean p1, p0, Ldefpackage/z64;->F:Z

    .line 82
    .line 83
    if-eq p1, p7, :cond_9

    .line 84
    .line 85
    iput-boolean p7, p0, Ldefpackage/z64;->F:Z

    .line 86
    .line 87
    if-nez p7, :cond_8

    .line 88
    .line 89
    iget-object p1, p0, Ldefpackage/z64;->O:Ldefpackage/jh1;

    .line 90
    .line 91
    if-eqz p1, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ldefpackage/fo0;->r0(Ldefpackage/eo0;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    iget-object p1, p0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 97
    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Ldefpackage/fo0;->r0(Ldefpackage/eo0;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    iput-object v1, p0, Ldefpackage/z64;->O:Ldefpackage/jh1;

    .line 104
    .line 105
    iput-object v1, p0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 106
    .line 107
    invoke-virtual {p0}, Ldefpackage/z64;->w0()V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 111
    .line 112
    :cond_8
    move p6, v4

    .line 113
    :cond_9
    iget-object p1, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 114
    .line 115
    invoke-static {p1, p4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_a

    .line 120
    .line 121
    invoke-virtual {p0}, Ldefpackage/z64;->w0()V

    .line 122
    .line 123
    .line 124
    iput-object p4, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 125
    .line 126
    :cond_a
    iget-object p1, p0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 127
    .line 128
    if-eq p1, p3, :cond_b

    .line 129
    .line 130
    iput-object p3, p0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_b
    move v4, p6

    .line 134
    :goto_2
    if-eqz v4, :cond_f

    .line 135
    .line 136
    iget-boolean p1, p0, Ldefpackage/z64;->K:Z

    .line 137
    .line 138
    sget-object p2, Ldefpackage/wu0;->a:Ldefpackage/wu0;

    .line 139
    .line 140
    if-eqz p1, :cond_d

    .line 141
    .line 142
    invoke-virtual {p0}, Ldefpackage/z64;->x0()V

    .line 143
    .line 144
    .line 145
    iget-boolean p1, p0, Ldefpackage/z64;->J:Z

    .line 146
    .line 147
    if-eqz p1, :cond_c

    .line 148
    .line 149
    invoke-virtual {p0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p1, p2}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :cond_c
    iput-object v1, p0, Ldefpackage/z64;->T:Ldefpackage/rm2;

    .line 157
    .line 158
    :cond_d
    iget-object p0, p0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 159
    .line 160
    if-eqz p0, :cond_f

    .line 161
    .line 162
    invoke-virtual {p0}, Ldefpackage/ly1;->a()V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Ldefpackage/ly1;->n:Ldefpackage/z64;

    .line 166
    .line 167
    iget-boolean p3, p1, Ldefpackage/z64;->J:Z

    .line 168
    .line 169
    if-eqz p3, :cond_e

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ldefpackage/z64;->A0(Ldefpackage/av0;)V

    .line 172
    .line 173
    .line 174
    :cond_e
    iput-object v1, p0, Ldefpackage/ly1;->t:Ldefpackage/rm2;

    .line 175
    .line 176
    iget-object p0, p0, Ldefpackage/ly1;->w:Ldefpackage/x7;

    .line 177
    .line 178
    iput v3, p0, Ldefpackage/x7;->o:I

    .line 179
    .line 180
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, Ldefpackage/l03;

    .line 183
    .line 184
    iput v3, p0, Ldefpackage/l03;->b:I

    .line 185
    .line 186
    :cond_f
    return-void
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/z64;->V:Ldefpackage/ly1;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/ly1;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/ly1;->n:Ldefpackage/z64;

    .line 9
    .line 10
    iget-boolean v1, v0, Ldefpackage/z64;->J:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Ldefpackage/wu0;->a:Ldefpackage/wu0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ldefpackage/z64;->A0(Ldefpackage/av0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Ldefpackage/ly1;->t:Ldefpackage/rm2;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/ly1;->w:Ldefpackage/x7;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Ldefpackage/x7;->o:I

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ldefpackage/l03;

    .line 30
    .line 31
    iput v0, p0, Ldefpackage/l03;->b:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/z64;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/z64;->b0:Ldefpackage/hy2;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 13
    .line 14
    iput-object v1, v0, Ldefpackage/ir2;->d:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldefpackage/z64;->c0:Ldefpackage/hw4;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 25
    .line 26
    iput-object v1, v0, Ldefpackage/ir2;->d:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Ldefpackage/z64;->t()V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Ldefpackage/cx2;->A:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 41
    .line 42
    iget-object p0, p0, Ldefpackage/z64;->d0:Ldefpackage/uk0;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v1, Ldefpackage/rm2;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Ldefpackage/rm2;-><init>(Ldefpackage/oo0;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Ldefpackage/ui0;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ldefpackage/ui0;-><init>(Ldefpackage/rm2;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Ldefpackage/uk0;->a:Ldefpackage/ui0;

    .line 58
    .line 59
    return-void
.end method

.method public final c0(Ldefpackage/q94;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/z64;->F:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/z64;->X:Ldefpackage/z;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/z64;->Y:Ldefpackage/j2;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, Ldefpackage/z;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v2, p0}, Ldefpackage/z;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ldefpackage/z64;->X:Ldefpackage/z;

    .line 21
    .line 22
    new-instance v0, Ldefpackage/j2;

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, Ldefpackage/j2;-><init>(Ldefpackage/z64;Ldefpackage/vd0;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ldefpackage/z64;->Y:Ldefpackage/j2;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Ldefpackage/z64;->X:Ldefpackage/z;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object v2, Ldefpackage/o94;->a:[Ldefpackage/c42;

    .line 34
    .line 35
    sget-object v2, Ldefpackage/d94;->d:Ldefpackage/p94;

    .line 36
    .line 37
    new-instance v3, Ldefpackage/w2;

    .line 38
    .line 39
    invoke-direct {v3, v1, v0}, Ldefpackage/w2;-><init>(Ljava/lang/String;Ldefpackage/sf1;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v2, v3}, Ldefpackage/q94;->a(Ldefpackage/p94;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object p0, p0, Ldefpackage/z64;->Y:Ldefpackage/j2;

    .line 46
    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    sget-object v0, Ldefpackage/o94;->a:[Ldefpackage/c42;

    .line 50
    .line 51
    sget-object v0, Ldefpackage/d94;->e:Ldefpackage/p94;

    .line 52
    .line 53
    invoke-interface {p1, v0, p0}, Ldefpackage/q94;->a(Ldefpackage/p94;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/z64;->b0:Ldefpackage/hy2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 10
    .line 11
    iput-object v1, v0, Ldefpackage/ir2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/z64;->c0:Ldefpackage/hw4;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 22
    .line 23
    iput-object v1, v0, Ldefpackage/ir2;->d:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_1
    iget-boolean v0, p0, Ldefpackage/cx2;->A:Z

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/z64;->d0:Ldefpackage/uk0;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Ldefpackage/rm2;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ldefpackage/rm2;-><init>(Ldefpackage/oo0;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ldefpackage/ui0;

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ldefpackage/ui0;-><init>(Ldefpackage/rm2;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Ldefpackage/uk0;->a:Ldefpackage/ui0;

    .line 52
    .line 53
    return-void
.end method

.method public final j0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldefpackage/z64;->J:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/z64;->w0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/z64;->O:Ldefpackage/jh1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ldefpackage/fo0;->r0(Ldefpackage/eo0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ldefpackage/fo0;->r0(Ldefpackage/eo0;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Ldefpackage/z64;->O:Ldefpackage/jh1;

    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 25
    .line 26
    return-void
.end method

.method public final n(Ldefpackage/kn3;Ldefpackage/ln3;J)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v1, v8, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v10, 0x0

    .line 14
    move v3, v10

    .line 15
    :goto_0
    sget-object v11, Ldefpackage/ln3;->o:Ldefpackage/ln3;

    .line 16
    .line 17
    sget-object v12, Ldefpackage/ln3;->n:Ldefpackage/ln3;

    .line 18
    .line 19
    const/4 v14, 0x1

    .line 20
    if-ge v3, v2, :cond_53

    .line 21
    .line 22
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ldefpackage/on3;

    .line 27
    .line 28
    iget-object v5, v0, Ldefpackage/z64;->E:Ldefpackage/k2;

    .line 29
    .line 30
    iget v4, v4, Ldefpackage/on3;->i:I

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-ne v4, v5, :cond_0

    .line 37
    .line 38
    move v4, v14

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v4, v10

    .line 41
    :goto_1
    if-nez v4, :cond_52

    .line 42
    .line 43
    iput-boolean v14, v0, Ldefpackage/z64;->K:Z

    .line 44
    .line 45
    iget-boolean v2, v0, Ldefpackage/z64;->F:Z

    .line 46
    .line 47
    if-eqz v2, :cond_53

    .line 48
    .line 49
    iget-object v2, v0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    new-instance v2, Ldefpackage/jh1;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Ldefpackage/jh1;-><init>(Ldefpackage/ih1;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 59
    .line 60
    .line 61
    iput-object v2, v0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 62
    .line 63
    :cond_1
    iget-object v2, v0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 64
    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    iget-object v2, v0, Ldefpackage/z64;->L:Ldefpackage/su0;

    .line 68
    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    new-instance v2, Ldefpackage/su0;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    sget-object v3, Ldefpackage/ru0;->p:Ldefpackage/ru0;

    .line 77
    .line 78
    iput-object v3, v2, Ldefpackage/su0;->f:Ldefpackage/ru0;

    .line 79
    .line 80
    iput-boolean v10, v2, Ldefpackage/su0;->g:Z

    .line 81
    .line 82
    iput-boolean v10, v2, Ldefpackage/su0;->h:Z

    .line 83
    .line 84
    iput-object v2, v0, Ldefpackage/z64;->L:Ldefpackage/su0;

    .line 85
    .line 86
    :cond_2
    iput-object v2, v0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 87
    .line 88
    :cond_3
    iget-object v2, v0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 89
    .line 90
    if-eqz v2, :cond_51

    .line 91
    .line 92
    instance-of v3, v2, Ldefpackage/su0;

    .line 93
    .line 94
    const-wide/16 v5, 0x0

    .line 95
    .line 96
    if-eqz v3, :cond_e

    .line 97
    .line 98
    check-cast v2, Ldefpackage/su0;

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    goto/16 :goto_27

    .line 107
    .line 108
    :cond_4
    invoke-static {v8, v10}, Ldefpackage/vq4;->b(Ldefpackage/kn3;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_5

    .line 113
    .line 114
    goto/16 :goto_27

    .line 115
    .line 116
    :cond_5
    invoke-static {v1}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Ldefpackage/on3;

    .line 121
    .line 122
    iget-object v3, v2, Ldefpackage/su0;->f:Ldefpackage/ru0;

    .line 123
    .line 124
    sget-object v4, Ldefpackage/dv0;->a:[I

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    aget v3, v4, v3

    .line 131
    .line 132
    sget-object v4, Ldefpackage/ru0;->o:Ldefpackage/ru0;

    .line 133
    .line 134
    sget-object v7, Ldefpackage/ru0;->n:Ldefpackage/ru0;

    .line 135
    .line 136
    if-ne v3, v14, :cond_9

    .line 137
    .line 138
    iget-object v3, v0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 139
    .line 140
    iget-object v15, v3, Ldefpackage/g74;->a:Ldefpackage/a74;

    .line 141
    .line 142
    invoke-interface {v15}, Ldefpackage/a74;->a()Z

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-nez v15, :cond_8

    .line 147
    .line 148
    iget-object v3, v3, Ldefpackage/g74;->b:Ldefpackage/tb;

    .line 149
    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    invoke-virtual {v3}, Ldefpackage/tb;->e()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move v3, v10

    .line 158
    :goto_2
    if-eqz v3, :cond_7

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    move-object v3, v7

    .line 162
    goto :goto_4

    .line 163
    :cond_8
    :goto_3
    move-object v3, v4

    .line 164
    goto :goto_4

    .line 165
    :cond_9
    iget-object v3, v2, Ldefpackage/su0;->f:Ldefpackage/ru0;

    .line 166
    .line 167
    :goto_4
    iput-object v3, v2, Ldefpackage/su0;->f:Ldefpackage/ru0;

    .line 168
    .line 169
    if-ne v9, v12, :cond_b

    .line 170
    .line 171
    if-ne v3, v4, :cond_a

    .line 172
    .line 173
    invoke-virtual {v1}, Ldefpackage/on3;->a()V

    .line 174
    .line 175
    .line 176
    iput-boolean v14, v2, Ldefpackage/su0;->g:Z

    .line 177
    .line 178
    :cond_a
    iput-boolean v14, v2, Ldefpackage/su0;->h:Z

    .line 179
    .line 180
    :cond_b
    if-ne v9, v11, :cond_53

    .line 181
    .line 182
    if-ne v3, v7, :cond_c

    .line 183
    .line 184
    iget-wide v2, v1, Ldefpackage/on3;->a:J

    .line 185
    .line 186
    const-wide/16 v4, 0x0

    .line 187
    .line 188
    const/16 v6, 0xc

    .line 189
    .line 190
    invoke-static/range {v0 .. v6}, Ldefpackage/z64;->z0(Ldefpackage/z64;Ldefpackage/on3;JJI)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_27

    .line 194
    .line 195
    :cond_c
    iget-boolean v2, v2, Ldefpackage/su0;->g:Z

    .line 196
    .line 197
    if-eqz v2, :cond_53

    .line 198
    .line 199
    invoke-virtual {v0, v1, v1, v5, v6}, Ldefpackage/z64;->E0(Ldefpackage/on3;Ldefpackage/on3;J)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1, v5, v6}, Ldefpackage/z64;->D0(Ldefpackage/on3;J)V

    .line 203
    .line 204
    .line 205
    iget-wide v1, v1, Ldefpackage/on3;->a:J

    .line 206
    .line 207
    iget-object v3, v0, Ldefpackage/z64;->P:Ldefpackage/vu0;

    .line 208
    .line 209
    if-nez v3, :cond_d

    .line 210
    .line 211
    new-instance v3, Ldefpackage/vu0;

    .line 212
    .line 213
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    const-wide v4, 0x7fffffffffffffffL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    iput-wide v4, v3, Ldefpackage/vu0;->f:J

    .line 222
    .line 223
    iput-object v3, v0, Ldefpackage/z64;->P:Ldefpackage/vu0;

    .line 224
    .line 225
    :cond_d
    iput-wide v1, v3, Ldefpackage/vu0;->f:J

    .line 226
    .line 227
    iput-object v3, v0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 228
    .line 229
    goto/16 :goto_27

    .line 230
    .line 231
    :cond_e
    instance-of v3, v2, Ldefpackage/uu0;

    .line 232
    .line 233
    sget-object v4, Ldefpackage/ln3;->p:Ldefpackage/ln3;

    .line 234
    .line 235
    if-eqz v3, :cond_3c

    .line 236
    .line 237
    check-cast v2, Ldefpackage/uu0;

    .line 238
    .line 239
    if-ne v9, v12, :cond_f

    .line 240
    .line 241
    goto/16 :goto_27

    .line 242
    .line 243
    :cond_f
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    move v5, v10

    .line 248
    :goto_5
    if-ge v5, v3, :cond_11

    .line 249
    .line 250
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    move-object v7, v6

    .line 255
    check-cast v7, Ldefpackage/on3;

    .line 256
    .line 257
    iget-wide v13, v7, Ldefpackage/on3;->a:J

    .line 258
    .line 259
    move-object/from16 v17, v11

    .line 260
    .line 261
    iget-wide v10, v2, Ldefpackage/uu0;->g:J

    .line 262
    .line 263
    invoke-static {v13, v14, v10, v11}, Ldefpackage/vr1;->n(JJ)Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_10

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_10
    add-int/lit8 v5, v5, 0x1

    .line 271
    .line 272
    move-object/from16 v11, v17

    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    const/4 v14, 0x1

    .line 276
    goto :goto_5

    .line 277
    :cond_11
    move-object/from16 v17, v11

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    :goto_6
    check-cast v6, Ldefpackage/on3;

    .line 281
    .line 282
    if-nez v6, :cond_15

    .line 283
    .line 284
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    const/4 v5, 0x0

    .line 289
    :goto_7
    if-ge v5, v3, :cond_13

    .line 290
    .line 291
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    move-object v7, v6

    .line 296
    check-cast v7, Ldefpackage/on3;

    .line 297
    .line 298
    iget-boolean v7, v7, Ldefpackage/on3;->d:Z

    .line 299
    .line 300
    if-eqz v7, :cond_12

    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_13
    const/4 v6, 0x0

    .line 307
    :goto_8
    check-cast v6, Ldefpackage/on3;

    .line 308
    .line 309
    if-nez v6, :cond_14

    .line 310
    .line 311
    invoke-virtual {v0}, Ldefpackage/z64;->x0()V

    .line 312
    .line 313
    .line 314
    move-object/from16 p3, v12

    .line 315
    .line 316
    move-object/from16 v10, v17

    .line 317
    .line 318
    goto/16 :goto_1d

    .line 319
    .line 320
    :cond_14
    iget-wide v10, v6, Ldefpackage/on3;->a:J

    .line 321
    .line 322
    iput-wide v10, v2, Ldefpackage/uu0;->g:J

    .line 323
    .line 324
    :cond_15
    const-string v3, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 325
    .line 326
    const-string v5, "AwaitTouchSlop.initialDown was not initialized"

    .line 327
    .line 328
    move-object/from16 v10, v17

    .line 329
    .line 330
    if-ne v9, v10, :cond_18

    .line 331
    .line 332
    invoke-virtual {v6}, Ldefpackage/on3;->c()Z

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    if-nez v7, :cond_35

    .line 337
    .line 338
    invoke-static {v6}, Ldefpackage/gi1;->i(Ldefpackage/on3;)Z

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    if-eqz v7, :cond_1a

    .line 343
    .line 344
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    const/4 v11, 0x0

    .line 349
    :goto_9
    if-ge v11, v7, :cond_17

    .line 350
    .line 351
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    move-object v14, v13

    .line 356
    check-cast v14, Ldefpackage/on3;

    .line 357
    .line 358
    iget-boolean v14, v14, Ldefpackage/on3;->d:Z

    .line 359
    .line 360
    if-eqz v14, :cond_16

    .line 361
    .line 362
    goto :goto_a

    .line 363
    :cond_16
    add-int/lit8 v11, v11, 0x1

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_17
    const/4 v13, 0x0

    .line 367
    :goto_a
    check-cast v13, Ldefpackage/on3;

    .line 368
    .line 369
    if-nez v13, :cond_19

    .line 370
    .line 371
    invoke-virtual {v0}, Ldefpackage/z64;->x0()V

    .line 372
    .line 373
    .line 374
    :cond_18
    :goto_b
    move-object/from16 v19, v3

    .line 375
    .line 376
    move-object/from16 v20, v5

    .line 377
    .line 378
    move-object/from16 p3, v12

    .line 379
    .line 380
    goto/16 :goto_1c

    .line 381
    .line 382
    :cond_19
    iget-wide v13, v13, Ldefpackage/on3;->a:J

    .line 383
    .line 384
    iput-wide v13, v2, Ldefpackage/uu0;->g:J

    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_1a
    sget-object v1, Ldefpackage/g90;->t:Ldefpackage/wl4;

    .line 388
    .line 389
    invoke-static {v0, v1}, Ldefpackage/kb4;->q(Ldefpackage/a90;Ldefpackage/qr3;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    check-cast v1, Ldefpackage/m65;

    .line 394
    .line 395
    iget v7, v6, Ldefpackage/on3;->i:I

    .line 396
    .line 397
    sget v11, Ldefpackage/bv0;->a:F

    .line 398
    .line 399
    const/4 v11, 0x2

    .line 400
    if-ne v7, v11, :cond_1b

    .line 401
    .line 402
    invoke-interface {v1}, Ldefpackage/m65;->c()F

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    sget v7, Ldefpackage/bv0;->a:F

    .line 407
    .line 408
    mul-float/2addr v1, v7

    .line 409
    goto :goto_c

    .line 410
    :cond_1b
    invoke-interface {v1}, Ldefpackage/m65;->c()F

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    :goto_c
    iget-object v7, v0, Ldefpackage/z64;->U:Ldefpackage/e20;

    .line 415
    .line 416
    if-eqz v7, :cond_34

    .line 417
    .line 418
    const/4 v11, 0x1

    .line 419
    invoke-static {v6, v11}, Ldefpackage/gi1;->S(Ldefpackage/on3;Z)J

    .line 420
    .line 421
    .line 422
    move-result-wide v13

    .line 423
    invoke-static {v7, v13, v14, v1}, Ldefpackage/e20;->u(Ldefpackage/e20;JF)J

    .line 424
    .line 425
    .line 426
    move-result-wide v13

    .line 427
    const-wide v17, 0x7fffffff7fffffffL

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    and-long v17, v13, v17

    .line 433
    .line 434
    const-wide v19, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    cmp-long v1, v17, v19

    .line 440
    .line 441
    if-eqz v1, :cond_33

    .line 442
    .line 443
    const/4 v1, 0x0

    .line 444
    invoke-static {v6, v1}, Ldefpackage/gi1;->S(Ldefpackage/on3;Z)J

    .line 445
    .line 446
    .line 447
    move-result-wide v7

    .line 448
    move-object/from16 p3, v12

    .line 449
    .line 450
    iget-wide v11, v0, Ldefpackage/z64;->M:J

    .line 451
    .line 452
    invoke-static {v11, v12, v7, v8}, Ldefpackage/g83;->e(JJ)J

    .line 453
    .line 454
    .line 455
    move-result-wide v7

    .line 456
    iput-wide v7, v0, Ldefpackage/z64;->M:J

    .line 457
    .line 458
    const/16 v1, 0x20

    .line 459
    .line 460
    shr-long/2addr v7, v1

    .line 461
    long-to-int v1, v7

    .line 462
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    iget-wide v7, v0, Ldefpackage/z64;->M:J

    .line 471
    .line 472
    const-wide v11, 0xffffffffL

    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    and-long/2addr v7, v11

    .line 478
    long-to-int v7, v7

    .line 479
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    float-to-double v7, v7

    .line 488
    float-to-double v11, v1

    .line 489
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 490
    .line 491
    .line 492
    move-result-wide v7

    .line 493
    double-to-float v1, v7

    .line 494
    const v7, 0x42652ee1

    .line 495
    .line 496
    .line 497
    mul-float/2addr v1, v7

    .line 498
    iget-object v7, v0, Ldefpackage/z64;->D:Ldefpackage/hb3;

    .line 499
    .line 500
    if-nez v7, :cond_1c

    .line 501
    .line 502
    :goto_d
    const/4 v7, 0x1

    .line 503
    goto :goto_f

    .line 504
    :cond_1c
    sget v8, Ldefpackage/ov0;->a:I

    .line 505
    .line 506
    sget-object v8, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 507
    .line 508
    const/high16 v11, 0x41f00000    # 30.0f

    .line 509
    .line 510
    if-ne v7, v8, :cond_1d

    .line 511
    .line 512
    cmpg-float v7, v1, v11

    .line 513
    .line 514
    if-gtz v7, :cond_1e

    .line 515
    .line 516
    goto :goto_e

    .line 517
    :cond_1d
    cmpl-float v7, v1, v11

    .line 518
    .line 519
    if-lez v7, :cond_1e

    .line 520
    .line 521
    const/high16 v7, 0x42b40000    # 90.0f

    .line 522
    .line 523
    cmpg-float v7, v1, v7

    .line 524
    .line 525
    if-gtz v7, :cond_1e

    .line 526
    .line 527
    :goto_e
    goto :goto_d

    .line 528
    :cond_1e
    const/4 v7, 0x0

    .line 529
    :goto_f
    new-instance v8, Ldefpackage/fx3;

    .line 530
    .line 531
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 532
    .line 533
    .line 534
    new-instance v11, Ldefpackage/cv0;

    .line 535
    .line 536
    invoke-direct {v11, v1, v8}, Ldefpackage/cv0;-><init>(FLdefpackage/fx3;)V

    .line 537
    .line 538
    .line 539
    sget v1, Ldefpackage/ov0;->a:I

    .line 540
    .line 541
    iget-object v1, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 542
    .line 543
    iget-boolean v1, v1, Ldefpackage/cx2;->A:Z

    .line 544
    .line 545
    if-nez v1, :cond_1f

    .line 546
    .line 547
    const-string v1, "visitAncestors called on an unattached node"

    .line 548
    .line 549
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    :cond_1f
    iget-object v1, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 553
    .line 554
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 555
    .line 556
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 557
    .line 558
    .line 559
    move-result-object v12

    .line 560
    :goto_10
    if-eqz v12, :cond_30

    .line 561
    .line 562
    iget-object v15, v12, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 563
    .line 564
    iget-object v15, v15, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v15, Ldefpackage/cx2;

    .line 567
    .line 568
    iget v15, v15, Ldefpackage/cx2;->q:I

    .line 569
    .line 570
    const/high16 v16, 0x40000

    .line 571
    .line 572
    and-int v15, v15, v16

    .line 573
    .line 574
    if-eqz v15, :cond_2e

    .line 575
    .line 576
    :goto_11
    if-eqz v1, :cond_2e

    .line 577
    .line 578
    iget v15, v1, Ldefpackage/cx2;->p:I

    .line 579
    .line 580
    and-int v15, v15, v16

    .line 581
    .line 582
    move-object/from16 v19, v3

    .line 583
    .line 584
    if-eqz v15, :cond_2d

    .line 585
    .line 586
    const/4 v15, 0x0

    .line 587
    move-object v3, v1

    .line 588
    :goto_12
    if-eqz v3, :cond_2d

    .line 589
    .line 590
    move-object/from16 v20, v5

    .line 591
    .line 592
    instance-of v5, v3, Ldefpackage/rx4;

    .line 593
    .line 594
    if-eqz v5, :cond_26

    .line 595
    .line 596
    check-cast v3, Ldefpackage/rx4;

    .line 597
    .line 598
    invoke-interface {v3}, Ldefpackage/rx4;->f()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    move/from16 v21, v7

    .line 603
    .line 604
    sget-object v7, Ldefpackage/jh1;->C:Ldefpackage/y41;

    .line 605
    .line 606
    if-eq v7, v5, :cond_21

    .line 607
    .line 608
    :cond_20
    :goto_13
    const/4 v3, 0x1

    .line 609
    goto :goto_15

    .line 610
    :cond_21
    instance-of v5, v3, Ldefpackage/jh1;

    .line 611
    .line 612
    if-eqz v5, :cond_25

    .line 613
    .line 614
    check-cast v3, Ldefpackage/jh1;

    .line 615
    .line 616
    iget-object v3, v3, Ldefpackage/jh1;->B:Ldefpackage/ih1;

    .line 617
    .line 618
    if-eqz v3, :cond_22

    .line 619
    .line 620
    goto :goto_14

    .line 621
    :cond_22
    const/4 v3, 0x0

    .line 622
    :goto_14
    if-nez v3, :cond_23

    .line 623
    .line 624
    goto :goto_13

    .line 625
    :cond_23
    instance-of v5, v3, Ldefpackage/mv0;

    .line 626
    .line 627
    if-eqz v5, :cond_20

    .line 628
    .line 629
    invoke-virtual {v11, v3}, Ldefpackage/cv0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    check-cast v3, Ljava/lang/Boolean;

    .line 634
    .line 635
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    :goto_15
    if-nez v3, :cond_24

    .line 640
    .line 641
    goto/16 :goto_1b

    .line 642
    .line 643
    :cond_24
    move-object/from16 v22, v11

    .line 644
    .line 645
    goto :goto_19

    .line 646
    :cond_25
    const-string v0, "Node is not a GestureNode instance"

    .line 647
    .line 648
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    :cond_26
    move/from16 v21, v7

    .line 653
    .line 654
    iget v5, v3, Ldefpackage/cx2;->p:I

    .line 655
    .line 656
    and-int v5, v5, v16

    .line 657
    .line 658
    if-eqz v5, :cond_24

    .line 659
    .line 660
    instance-of v5, v3, Ldefpackage/fo0;

    .line 661
    .line 662
    if-eqz v5, :cond_24

    .line 663
    .line 664
    move-object v5, v3

    .line 665
    check-cast v5, Ldefpackage/fo0;

    .line 666
    .line 667
    iget-object v5, v5, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 668
    .line 669
    const/4 v7, 0x0

    .line 670
    :goto_16
    if-eqz v5, :cond_2b

    .line 671
    .line 672
    move-object/from16 v22, v11

    .line 673
    .line 674
    iget v11, v5, Ldefpackage/cx2;->p:I

    .line 675
    .line 676
    and-int v11, v11, v16

    .line 677
    .line 678
    if-eqz v11, :cond_2a

    .line 679
    .line 680
    add-int/lit8 v7, v7, 0x1

    .line 681
    .line 682
    const/4 v11, 0x1

    .line 683
    if-ne v7, v11, :cond_27

    .line 684
    .line 685
    move-object v3, v5

    .line 686
    goto :goto_17

    .line 687
    :cond_27
    if-nez v15, :cond_28

    .line 688
    .line 689
    new-instance v11, Ldefpackage/f13;

    .line 690
    .line 691
    const/16 v15, 0x10

    .line 692
    .line 693
    new-array v15, v15, [Ldefpackage/cx2;

    .line 694
    .line 695
    invoke-direct {v11, v15}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    move-object v15, v11

    .line 699
    :cond_28
    if-eqz v3, :cond_29

    .line 700
    .line 701
    invoke-virtual {v15, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    const/4 v3, 0x0

    .line 705
    :cond_29
    invoke-virtual {v15, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    :cond_2a
    :goto_17
    iget-object v5, v5, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 709
    .line 710
    move-object/from16 v11, v22

    .line 711
    .line 712
    goto :goto_16

    .line 713
    :cond_2b
    move-object/from16 v22, v11

    .line 714
    .line 715
    const/4 v11, 0x1

    .line 716
    if-ne v7, v11, :cond_2c

    .line 717
    .line 718
    :goto_18
    move-object/from16 v5, v20

    .line 719
    .line 720
    move/from16 v7, v21

    .line 721
    .line 722
    move-object/from16 v11, v22

    .line 723
    .line 724
    goto/16 :goto_12

    .line 725
    .line 726
    :cond_2c
    :goto_19
    invoke-static {v15}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    goto :goto_18

    .line 731
    :cond_2d
    move-object/from16 v20, v5

    .line 732
    .line 733
    move/from16 v21, v7

    .line 734
    .line 735
    move-object/from16 v22, v11

    .line 736
    .line 737
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 738
    .line 739
    move-object/from16 v3, v19

    .line 740
    .line 741
    move-object/from16 v5, v20

    .line 742
    .line 743
    move/from16 v7, v21

    .line 744
    .line 745
    move-object/from16 v11, v22

    .line 746
    .line 747
    goto/16 :goto_11

    .line 748
    .line 749
    :cond_2e
    move-object/from16 v19, v3

    .line 750
    .line 751
    move-object/from16 v20, v5

    .line 752
    .line 753
    move/from16 v21, v7

    .line 754
    .line 755
    move-object/from16 v22, v11

    .line 756
    .line 757
    invoke-virtual {v12}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 758
    .line 759
    .line 760
    move-result-object v12

    .line 761
    if-eqz v12, :cond_2f

    .line 762
    .line 763
    iget-object v1, v12, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 764
    .line 765
    if-eqz v1, :cond_2f

    .line 766
    .line 767
    iget-object v1, v1, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v1, Ldefpackage/sq4;

    .line 770
    .line 771
    goto :goto_1a

    .line 772
    :cond_2f
    const/4 v1, 0x0

    .line 773
    :goto_1a
    move-object/from16 v3, v19

    .line 774
    .line 775
    move-object/from16 v5, v20

    .line 776
    .line 777
    move/from16 v7, v21

    .line 778
    .line 779
    move-object/from16 v11, v22

    .line 780
    .line 781
    goto/16 :goto_10

    .line 782
    .line 783
    :cond_30
    move-object/from16 v19, v3

    .line 784
    .line 785
    move-object/from16 v20, v5

    .line 786
    .line 787
    move/from16 v21, v7

    .line 788
    .line 789
    :goto_1b
    if-nez v21, :cond_31

    .line 790
    .line 791
    iget-boolean v1, v8, Ldefpackage/fx3;->n:Z

    .line 792
    .line 793
    if-eqz v1, :cond_31

    .line 794
    .line 795
    const/4 v11, 0x1

    .line 796
    iput-boolean v11, v2, Ldefpackage/uu0;->h:Z

    .line 797
    .line 798
    goto :goto_1c

    .line 799
    :cond_31
    invoke-virtual {v6}, Ldefpackage/on3;->a()V

    .line 800
    .line 801
    .line 802
    iget-object v1, v2, Ldefpackage/uu0;->f:Ldefpackage/on3;

    .line 803
    .line 804
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v0, v1, v6, v13, v14}, Ldefpackage/z64;->E0(Ldefpackage/on3;Ldefpackage/on3;J)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v6, v13, v14}, Ldefpackage/z64;->D0(Ldefpackage/on3;J)V

    .line 811
    .line 812
    .line 813
    iget-wide v7, v6, Ldefpackage/on3;->a:J

    .line 814
    .line 815
    iget-object v1, v0, Ldefpackage/z64;->P:Ldefpackage/vu0;

    .line 816
    .line 817
    if-nez v1, :cond_32

    .line 818
    .line 819
    new-instance v1, Ldefpackage/vu0;

    .line 820
    .line 821
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 822
    .line 823
    .line 824
    const-wide v11, 0x7fffffffffffffffL

    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    iput-wide v11, v1, Ldefpackage/vu0;->f:J

    .line 830
    .line 831
    iput-object v1, v0, Ldefpackage/z64;->P:Ldefpackage/vu0;

    .line 832
    .line 833
    :cond_32
    iput-wide v7, v1, Ldefpackage/vu0;->f:J

    .line 834
    .line 835
    iput-object v1, v0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 836
    .line 837
    goto :goto_1c

    .line 838
    :cond_33
    move-object/from16 v19, v3

    .line 839
    .line 840
    move-object/from16 v20, v5

    .line 841
    .line 842
    move-object/from16 p3, v12

    .line 843
    .line 844
    const/4 v11, 0x1

    .line 845
    iput-boolean v11, v2, Ldefpackage/uu0;->h:Z

    .line 846
    .line 847
    iget-wide v7, v0, Ldefpackage/z64;->M:J

    .line 848
    .line 849
    invoke-static {v6, v11}, Ldefpackage/gi1;->S(Ldefpackage/on3;Z)J

    .line 850
    .line 851
    .line 852
    move-result-wide v12

    .line 853
    invoke-static {v7, v8, v12, v13}, Ldefpackage/g83;->e(JJ)J

    .line 854
    .line 855
    .line 856
    move-result-wide v7

    .line 857
    iput-wide v7, v0, Ldefpackage/z64;->M:J

    .line 858
    .line 859
    goto :goto_1c

    .line 860
    :cond_34
    const-string v0, "Touch slop detector not initialized."

    .line 861
    .line 862
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    return-void

    .line 866
    :cond_35
    move-object/from16 v19, v3

    .line 867
    .line 868
    move-object/from16 v20, v5

    .line 869
    .line 870
    move-object/from16 p3, v12

    .line 871
    .line 872
    iget-object v1, v2, Ldefpackage/uu0;->f:Ldefpackage/on3;

    .line 873
    .line 874
    if-eqz v1, :cond_37

    .line 875
    .line 876
    iget-wide v7, v2, Ldefpackage/uu0;->g:J

    .line 877
    .line 878
    iget-object v3, v0, Ldefpackage/z64;->U:Ldefpackage/e20;

    .line 879
    .line 880
    if-eqz v3, :cond_36

    .line 881
    .line 882
    invoke-virtual {v0, v1, v7, v8, v3}, Ldefpackage/z64;->y0(Ldefpackage/on3;JLdefpackage/e20;)V

    .line 883
    .line 884
    .line 885
    goto :goto_1c

    .line 886
    :cond_36
    invoke-static/range {v19 .. v19}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    return-void

    .line 890
    :cond_37
    invoke-static/range {v20 .. v20}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    return-void

    .line 894
    :goto_1c
    if-ne v9, v4, :cond_3b

    .line 895
    .line 896
    iget-boolean v1, v2, Ldefpackage/uu0;->h:Z

    .line 897
    .line 898
    if-eqz v1, :cond_3b

    .line 899
    .line 900
    invoke-virtual {v6}, Ldefpackage/on3;->c()Z

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    if-eqz v1, :cond_3a

    .line 905
    .line 906
    iget-object v1, v2, Ldefpackage/uu0;->f:Ldefpackage/on3;

    .line 907
    .line 908
    if-eqz v1, :cond_39

    .line 909
    .line 910
    iget-wide v2, v2, Ldefpackage/uu0;->g:J

    .line 911
    .line 912
    iget-object v4, v0, Ldefpackage/z64;->U:Ldefpackage/e20;

    .line 913
    .line 914
    if-eqz v4, :cond_38

    .line 915
    .line 916
    invoke-virtual {v0, v1, v2, v3, v4}, Ldefpackage/z64;->y0(Ldefpackage/on3;JLdefpackage/e20;)V

    .line 917
    .line 918
    .line 919
    goto :goto_1d

    .line 920
    :cond_38
    invoke-static/range {v19 .. v19}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    return-void

    .line 924
    :cond_39
    invoke-static/range {v20 .. v20}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    return-void

    .line 928
    :cond_3a
    const/4 v1, 0x0

    .line 929
    iput-boolean v1, v2, Ldefpackage/uu0;->h:Z

    .line 930
    .line 931
    move v8, v1

    .line 932
    goto/16 :goto_28

    .line 933
    .line 934
    :cond_3b
    :goto_1d
    const/4 v8, 0x0

    .line 935
    goto/16 :goto_28

    .line 936
    .line 937
    :cond_3c
    move-object v10, v11

    .line 938
    move-object/from16 p3, v12

    .line 939
    .line 940
    instance-of v3, v2, Ldefpackage/tu0;

    .line 941
    .line 942
    if-eqz v3, :cond_44

    .line 943
    .line 944
    check-cast v2, Ldefpackage/tu0;

    .line 945
    .line 946
    if-eq v9, v4, :cond_3d

    .line 947
    .line 948
    goto :goto_1d

    .line 949
    :cond_3d
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 950
    .line 951
    .line 952
    move-result v3

    .line 953
    const/4 v4, 0x0

    .line 954
    :goto_1e
    if-ge v4, v3, :cond_3f

    .line 955
    .line 956
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v5

    .line 960
    check-cast v5, Ldefpackage/on3;

    .line 961
    .line 962
    invoke-virtual {v5}, Ldefpackage/on3;->c()Z

    .line 963
    .line 964
    .line 965
    move-result v5

    .line 966
    if-eqz v5, :cond_3e

    .line 967
    .line 968
    const/4 v3, 0x0

    .line 969
    goto :goto_1f

    .line 970
    :cond_3e
    add-int/lit8 v4, v4, 0x1

    .line 971
    .line 972
    goto :goto_1e

    .line 973
    :cond_3f
    const/4 v3, 0x1

    .line 974
    :goto_1f
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 975
    .line 976
    .line 977
    move-result v4

    .line 978
    const/4 v5, 0x0

    .line 979
    :goto_20
    if-ge v5, v4, :cond_43

    .line 980
    .line 981
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v6

    .line 985
    check-cast v6, Ldefpackage/on3;

    .line 986
    .line 987
    iget-boolean v6, v6, Ldefpackage/on3;->d:Z

    .line 988
    .line 989
    if-eqz v6, :cond_42

    .line 990
    .line 991
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 992
    .line 993
    .line 994
    move-result v4

    .line 995
    if-eqz v4, :cond_40

    .line 996
    .line 997
    goto :goto_21

    .line 998
    :cond_40
    if-eqz v3, :cond_3b

    .line 999
    .line 1000
    invoke-static {v1}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    check-cast v1, Ldefpackage/on3;

    .line 1005
    .line 1006
    iget-wide v3, v1, Ldefpackage/on3;->c:J

    .line 1007
    .line 1008
    iget-object v1, v2, Ldefpackage/tu0;->f:Ldefpackage/on3;

    .line 1009
    .line 1010
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    iget-wide v5, v1, Ldefpackage/on3;->c:J

    .line 1014
    .line 1015
    invoke-static {v3, v4, v5, v6}, Ldefpackage/g83;->d(JJ)J

    .line 1016
    .line 1017
    .line 1018
    move-result-wide v4

    .line 1019
    iget-object v1, v2, Ldefpackage/tu0;->f:Ldefpackage/on3;

    .line 1020
    .line 1021
    if-eqz v1, :cond_41

    .line 1022
    .line 1023
    iget-wide v2, v2, Ldefpackage/tu0;->g:J

    .line 1024
    .line 1025
    const/16 v6, 0x8

    .line 1026
    .line 1027
    invoke-static/range {v0 .. v6}, Ldefpackage/z64;->z0(Ldefpackage/z64;Ldefpackage/on3;JJI)V

    .line 1028
    .line 1029
    .line 1030
    goto :goto_1d

    .line 1031
    :cond_41
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 1032
    .line 1033
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    return-void

    .line 1037
    :cond_42
    add-int/lit8 v5, v5, 0x1

    .line 1038
    .line 1039
    goto :goto_20

    .line 1040
    :cond_43
    :goto_21
    invoke-virtual {v0}, Ldefpackage/z64;->x0()V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_1d

    .line 1044
    :cond_44
    instance-of v3, v2, Ldefpackage/vu0;

    .line 1045
    .line 1046
    if-eqz v3, :cond_50

    .line 1047
    .line 1048
    check-cast v2, Ldefpackage/vu0;

    .line 1049
    .line 1050
    if-eq v9, v10, :cond_45

    .line 1051
    .line 1052
    goto :goto_1d

    .line 1053
    :cond_45
    iget-wide v3, v2, Ldefpackage/vu0;->f:J

    .line 1054
    .line 1055
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1056
    .line 1057
    .line 1058
    move-result v7

    .line 1059
    const/4 v8, 0x0

    .line 1060
    :goto_22
    if-ge v8, v7, :cond_47

    .line 1061
    .line 1062
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v11

    .line 1066
    move-object v12, v11

    .line 1067
    check-cast v12, Ldefpackage/on3;

    .line 1068
    .line 1069
    iget-wide v12, v12, Ldefpackage/on3;->a:J

    .line 1070
    .line 1071
    invoke-static {v12, v13, v3, v4}, Ldefpackage/vr1;->n(JJ)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v12

    .line 1075
    if-eqz v12, :cond_46

    .line 1076
    .line 1077
    goto :goto_23

    .line 1078
    :cond_46
    add-int/lit8 v8, v8, 0x1

    .line 1079
    .line 1080
    goto :goto_22

    .line 1081
    :cond_47
    const/4 v11, 0x0

    .line 1082
    :goto_23
    check-cast v11, Ldefpackage/on3;

    .line 1083
    .line 1084
    if-nez v11, :cond_48

    .line 1085
    .line 1086
    goto/16 :goto_1d

    .line 1087
    .line 1088
    :cond_48
    invoke-static {v11}, Ldefpackage/gi1;->i(Ldefpackage/on3;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v3

    .line 1092
    sget-object v4, Ldefpackage/wu0;->a:Ldefpackage/wu0;

    .line 1093
    .line 1094
    if-eqz v3, :cond_4d

    .line 1095
    .line 1096
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1097
    .line 1098
    .line 1099
    move-result v3

    .line 1100
    const/4 v7, 0x0

    .line 1101
    :goto_24
    if-ge v7, v3, :cond_4a

    .line 1102
    .line 1103
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v8

    .line 1107
    move-object v12, v8

    .line 1108
    check-cast v12, Ldefpackage/on3;

    .line 1109
    .line 1110
    iget-boolean v12, v12, Ldefpackage/on3;->d:Z

    .line 1111
    .line 1112
    if-eqz v12, :cond_49

    .line 1113
    .line 1114
    goto :goto_25

    .line 1115
    :cond_49
    add-int/lit8 v7, v7, 0x1

    .line 1116
    .line 1117
    goto :goto_24

    .line 1118
    :cond_4a
    const/4 v8, 0x0

    .line 1119
    :goto_25
    check-cast v8, Ldefpackage/on3;

    .line 1120
    .line 1121
    if-nez v8, :cond_4c

    .line 1122
    .line 1123
    invoke-virtual {v11}, Ldefpackage/on3;->c()Z

    .line 1124
    .line 1125
    .line 1126
    move-result v1

    .line 1127
    if-nez v1, :cond_4b

    .line 1128
    .line 1129
    invoke-static {v11}, Ldefpackage/gi1;->i(Ldefpackage/on3;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v1

    .line 1133
    if-eqz v1, :cond_4b

    .line 1134
    .line 1135
    sget-object v1, Ldefpackage/g90;->t:Ldefpackage/wl4;

    .line 1136
    .line 1137
    invoke-static {v0, v1}, Ldefpackage/kb4;->q(Ldefpackage/a90;Ldefpackage/qr3;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    check-cast v1, Ldefpackage/m65;

    .line 1142
    .line 1143
    invoke-interface {v1}, Ldefpackage/m65;->b()F

    .line 1144
    .line 1145
    .line 1146
    move-result v1

    .line 1147
    invoke-virtual {v0}, Ldefpackage/z64;->C0()Ldefpackage/rm2;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    invoke-static {v2, v11}, Ldefpackage/xl;->e(Ldefpackage/rm2;Ldefpackage/on3;)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v0}, Ldefpackage/z64;->C0()Ldefpackage/rm2;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    invoke-static {v1, v1}, Ldefpackage/e35;->h(FF)J

    .line 1159
    .line 1160
    .line 1161
    move-result-wide v3

    .line 1162
    invoke-virtual {v2, v3, v4}, Ldefpackage/rm2;->c(J)J

    .line 1163
    .line 1164
    .line 1165
    move-result-wide v1

    .line 1166
    invoke-virtual {v0}, Ldefpackage/z64;->C0()Ldefpackage/rm2;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v3

    .line 1170
    iget-object v3, v3, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 1171
    .line 1172
    check-cast v3, Ldefpackage/qf2;

    .line 1173
    .line 1174
    iget-object v4, v3, Ldefpackage/qf2;->a:Ldefpackage/m45;

    .line 1175
    .line 1176
    iget-object v7, v4, Ldefpackage/m45;->d:[Ldefpackage/vh0;

    .line 1177
    .line 1178
    const/4 v8, 0x0

    .line 1179
    invoke-static {v7, v8}, Ldefpackage/ti;->h0([Ljava/lang/Object;Ldefpackage/f01;)V

    .line 1180
    .line 1181
    .line 1182
    const/4 v7, 0x0

    .line 1183
    iput v7, v4, Ldefpackage/m45;->e:I

    .line 1184
    .line 1185
    iget-object v4, v3, Ldefpackage/qf2;->b:Ldefpackage/m45;

    .line 1186
    .line 1187
    iget-object v11, v4, Ldefpackage/m45;->d:[Ldefpackage/vh0;

    .line 1188
    .line 1189
    invoke-static {v11, v8}, Ldefpackage/ti;->h0([Ljava/lang/Object;Ldefpackage/f01;)V

    .line 1190
    .line 1191
    .line 1192
    iput v7, v4, Ldefpackage/m45;->e:I

    .line 1193
    .line 1194
    iput-wide v5, v3, Ldefpackage/qf2;->c:J

    .line 1195
    .line 1196
    invoke-virtual {v0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v3

    .line 1200
    new-instance v4, Ldefpackage/zu0;

    .line 1201
    .line 1202
    invoke-static {v1, v2}, Ldefpackage/ov0;->a(J)J

    .line 1203
    .line 1204
    .line 1205
    move-result-wide v1

    .line 1206
    invoke-direct {v4, v7, v1, v2}, Ldefpackage/zu0;-><init>(ZJ)V

    .line 1207
    .line 1208
    .line 1209
    invoke-interface {v3, v4}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    iput-boolean v7, v0, Ldefpackage/z64;->K:Z

    .line 1213
    .line 1214
    goto :goto_26

    .line 1215
    :cond_4b
    invoke-virtual {v0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v1

    .line 1219
    invoke-interface {v1, v4}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    :goto_26
    invoke-virtual {v0}, Ldefpackage/z64;->x0()V

    .line 1223
    .line 1224
    .line 1225
    goto/16 :goto_1d

    .line 1226
    .line 1227
    :cond_4c
    iget-wide v3, v8, Ldefpackage/on3;->a:J

    .line 1228
    .line 1229
    iput-wide v3, v2, Ldefpackage/vu0;->f:J

    .line 1230
    .line 1231
    goto/16 :goto_1d

    .line 1232
    .line 1233
    :cond_4d
    invoke-virtual {v11}, Ldefpackage/on3;->c()Z

    .line 1234
    .line 1235
    .line 1236
    move-result v1

    .line 1237
    if-eqz v1, :cond_4e

    .line 1238
    .line 1239
    invoke-virtual {v0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    invoke-interface {v1, v4}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    goto/16 :goto_1d

    .line 1247
    .line 1248
    :cond_4e
    const/4 v1, 0x1

    .line 1249
    invoke-static {v11, v1}, Ldefpackage/gi1;->S(Ldefpackage/on3;Z)J

    .line 1250
    .line 1251
    .line 1252
    move-result-wide v2

    .line 1253
    invoke-static {v2, v3}, Ldefpackage/g83;->c(J)F

    .line 1254
    .line 1255
    .line 1256
    move-result v1

    .line 1257
    const/4 v2, 0x0

    .line 1258
    cmpg-float v1, v1, v2

    .line 1259
    .line 1260
    if-nez v1, :cond_4f

    .line 1261
    .line 1262
    goto/16 :goto_1d

    .line 1263
    .line 1264
    :cond_4f
    const/4 v8, 0x0

    .line 1265
    invoke-static {v11, v8}, Ldefpackage/gi1;->S(Ldefpackage/on3;Z)J

    .line 1266
    .line 1267
    .line 1268
    move-result-wide v1

    .line 1269
    invoke-virtual {v0, v11, v1, v2}, Ldefpackage/z64;->D0(Ldefpackage/on3;J)V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v11}, Ldefpackage/on3;->a()V

    .line 1273
    .line 1274
    .line 1275
    goto :goto_28

    .line 1276
    :cond_50
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 1277
    .line 1278
    .line 1279
    return-void

    .line 1280
    :cond_51
    const-string v0, "currentDragState should not be null"

    .line 1281
    .line 1282
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    return-void

    .line 1286
    :cond_52
    move v8, v10

    .line 1287
    add-int/lit8 v3, v3, 0x1

    .line 1288
    .line 1289
    move-object/from16 v8, p1

    .line 1290
    .line 1291
    goto/16 :goto_0

    .line 1292
    .line 1293
    :cond_53
    :goto_27
    move v8, v10

    .line 1294
    move-object v10, v11

    .line 1295
    move-object/from16 p3, v12

    .line 1296
    .line 1297
    :goto_28
    iget-boolean v1, v0, Ldefpackage/z64;->F:Z

    .line 1298
    .line 1299
    if-eqz v1, :cond_65

    .line 1300
    .line 1301
    iget-object v1, v0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 1302
    .line 1303
    if-nez v1, :cond_54

    .line 1304
    .line 1305
    new-instance v1, Ldefpackage/jh1;

    .line 1306
    .line 1307
    invoke-direct {v1, v0}, Ldefpackage/jh1;-><init>(Ldefpackage/ih1;)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v0, v1}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 1311
    .line 1312
    .line 1313
    iput-object v1, v0, Ldefpackage/z64;->N:Ldefpackage/jh1;

    .line 1314
    .line 1315
    :cond_54
    const/4 v11, 0x3

    .line 1316
    const/4 v12, 0x6

    .line 1317
    const/16 v13, 0xc

    .line 1318
    .line 1319
    move-object/from16 v14, p3

    .line 1320
    .line 1321
    move-object/from16 v15, p1

    .line 1322
    .line 1323
    if-ne v9, v14, :cond_57

    .line 1324
    .line 1325
    iget v1, v15, Ldefpackage/kn3;->c:I

    .line 1326
    .line 1327
    if-ne v1, v12, :cond_57

    .line 1328
    .line 1329
    iget-boolean v1, v0, Ldefpackage/z64;->Z:Z

    .line 1330
    .line 1331
    if-nez v1, :cond_56

    .line 1332
    .line 1333
    new-instance v1, Ldefpackage/hy2;

    .line 1334
    .line 1335
    new-instance v2, Ldefpackage/zh0;

    .line 1336
    .line 1337
    iget-object v3, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1338
    .line 1339
    iget-boolean v3, v3, Ldefpackage/cx2;->A:Z

    .line 1340
    .line 1341
    if-nez v3, :cond_55

    .line 1342
    .line 1343
    const-string v3, "Cannot get View because the Modifier node is not currently attached."

    .line 1344
    .line 1345
    invoke-static {v3}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    :cond_55
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v3

    .line 1352
    invoke-static {v3}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    check-cast v3, Landroid/view/View;

    .line 1357
    .line 1358
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v3

    .line 1362
    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v3

    .line 1366
    const/4 v4, 0x4

    .line 1367
    invoke-direct {v2, v4, v3}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 1368
    .line 1369
    .line 1370
    new-instance v0, Ldefpackage/q70;

    .line 1371
    .line 1372
    const/4 v6, 0x4

    .line 1373
    const/4 v7, 0x1

    .line 1374
    move-object v3, v1

    .line 1375
    const/4 v1, 0x2

    .line 1376
    move-object v4, v3

    .line 1377
    const-class v3, Ldefpackage/z64;

    .line 1378
    .line 1379
    move-object v5, v4

    .line 1380
    const-string v4, "onMouseWheelScrollStopped"

    .line 1381
    .line 1382
    move-object/from16 v16, v5

    .line 1383
    .line 1384
    const-string v5, "onMouseWheelScrollStopped-TH1AsA0(J)V"

    .line 1385
    .line 1386
    move-object v12, v2

    .line 1387
    move-object/from16 v8, v16

    .line 1388
    .line 1389
    move-object/from16 v2, p0

    .line 1390
    .line 1391
    invoke-direct/range {v0 .. v7}, Ldefpackage/q70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1392
    .line 1393
    .line 1394
    move-object v1, v0

    .line 1395
    move-object v0, v2

    .line 1396
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    iget-object v2, v2, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 1401
    .line 1402
    iget-object v3, v0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 1403
    .line 1404
    invoke-direct {v8, v3, v12, v1, v2}, Ldefpackage/hy2;-><init>(Ldefpackage/g74;Ldefpackage/zh0;Ldefpackage/q70;Ldefpackage/oo0;)V

    .line 1405
    .line 1406
    .line 1407
    iput-object v8, v0, Ldefpackage/z64;->b0:Ldefpackage/hy2;

    .line 1408
    .line 1409
    const/4 v1, 0x1

    .line 1410
    iput-boolean v1, v0, Ldefpackage/z64;->Z:Z

    .line 1411
    .line 1412
    :cond_56
    iget-object v1, v0, Ldefpackage/z64;->b0:Ldefpackage/hy2;

    .line 1413
    .line 1414
    if-eqz v1, :cond_57

    .line 1415
    .line 1416
    invoke-virtual {v0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v2

    .line 1420
    iget-object v3, v1, Ldefpackage/hy2;->h:Ldefpackage/sk4;

    .line 1421
    .line 1422
    if-nez v3, :cond_57

    .line 1423
    .line 1424
    new-instance v3, Ldefpackage/p;

    .line 1425
    .line 1426
    const/4 v8, 0x0

    .line 1427
    invoke-direct {v3, v1, v8, v13}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 1428
    .line 1429
    .line 1430
    invoke-static {v2, v8, v8, v3, v11}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    iput-object v2, v1, Ldefpackage/hy2;->h:Ldefpackage/sk4;

    .line 1435
    .line 1436
    :cond_57
    iget-object v1, v0, Ldefpackage/z64;->b0:Ldefpackage/hy2;

    .line 1437
    .line 1438
    if-eqz v1, :cond_5b

    .line 1439
    .line 1440
    iget v2, v15, Ldefpackage/kn3;->c:I

    .line 1441
    .line 1442
    const/4 v3, 0x6

    .line 1443
    if-ne v2, v3, :cond_5b

    .line 1444
    .line 1445
    iget-object v2, v15, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 1446
    .line 1447
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1448
    .line 1449
    .line 1450
    move-result v3

    .line 1451
    const/4 v4, 0x0

    .line 1452
    :goto_29
    if-ge v4, v3, :cond_59

    .line 1453
    .line 1454
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v5

    .line 1458
    check-cast v5, Ldefpackage/on3;

    .line 1459
    .line 1460
    invoke-virtual {v5}, Ldefpackage/on3;->c()Z

    .line 1461
    .line 1462
    .line 1463
    move-result v5

    .line 1464
    if-eqz v5, :cond_58

    .line 1465
    .line 1466
    goto :goto_2a

    .line 1467
    :cond_58
    add-int/lit8 v4, v4, 0x1

    .line 1468
    .line 1469
    goto :goto_29

    .line 1470
    :cond_59
    if-ne v9, v14, :cond_5a

    .line 1471
    .line 1472
    iget-boolean v2, v1, Ldefpackage/ir2;->a:Z

    .line 1473
    .line 1474
    if-eqz v2, :cond_5a

    .line 1475
    .line 1476
    invoke-virtual {v1, v15}, Ldefpackage/hy2;->H(Ldefpackage/kn3;)Z

    .line 1477
    .line 1478
    .line 1479
    invoke-static {v15}, Ldefpackage/ir2;->a(Ldefpackage/kn3;)V

    .line 1480
    .line 1481
    .line 1482
    :cond_5a
    if-ne v9, v10, :cond_5b

    .line 1483
    .line 1484
    iget-boolean v2, v1, Ldefpackage/ir2;->a:Z

    .line 1485
    .line 1486
    if-nez v2, :cond_5b

    .line 1487
    .line 1488
    invoke-virtual {v1, v15}, Ldefpackage/hy2;->H(Ldefpackage/kn3;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v1

    .line 1492
    if-eqz v1, :cond_5b

    .line 1493
    .line 1494
    invoke-static {v15}, Ldefpackage/ir2;->a(Ldefpackage/kn3;)V

    .line 1495
    .line 1496
    .line 1497
    :cond_5b
    :goto_2a
    const/16 v8, 0xb

    .line 1498
    .line 1499
    const/16 v12, 0xa

    .line 1500
    .line 1501
    if-ne v9, v14, :cond_5f

    .line 1502
    .line 1503
    iget v1, v15, Ldefpackage/kn3;->c:I

    .line 1504
    .line 1505
    if-ne v1, v12, :cond_5c

    .line 1506
    .line 1507
    goto :goto_2b

    .line 1508
    :cond_5c
    if-ne v1, v8, :cond_5d

    .line 1509
    .line 1510
    goto :goto_2b

    .line 1511
    :cond_5d
    if-ne v1, v13, :cond_5f

    .line 1512
    .line 1513
    :goto_2b
    iget-boolean v1, v0, Ldefpackage/z64;->a0:Z

    .line 1514
    .line 1515
    if-nez v1, :cond_5e

    .line 1516
    .line 1517
    new-instance v1, Ldefpackage/hw4;

    .line 1518
    .line 1519
    new-instance v0, Ldefpackage/q70;

    .line 1520
    .line 1521
    const/4 v6, 0x4

    .line 1522
    const/4 v7, 0x2

    .line 1523
    move-object v2, v1

    .line 1524
    const/4 v1, 0x2

    .line 1525
    const-class v3, Ldefpackage/z64;

    .line 1526
    .line 1527
    const-string v4, "onTrackpadScrollStopped"

    .line 1528
    .line 1529
    const-string v5, "onTrackpadScrollStopped-TH1AsA0(J)V"

    .line 1530
    .line 1531
    move-object v13, v2

    .line 1532
    move-object/from16 v2, p0

    .line 1533
    .line 1534
    invoke-direct/range {v0 .. v7}, Ldefpackage/q70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1535
    .line 1536
    .line 1537
    move-object v1, v0

    .line 1538
    move-object v0, v2

    .line 1539
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v2

    .line 1543
    iget-object v2, v2, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 1544
    .line 1545
    iget-object v3, v0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 1546
    .line 1547
    invoke-direct {v13, v3, v1, v2}, Ldefpackage/hw4;-><init>(Ldefpackage/g74;Ldefpackage/q70;Ldefpackage/oo0;)V

    .line 1548
    .line 1549
    .line 1550
    iput-object v13, v0, Ldefpackage/z64;->c0:Ldefpackage/hw4;

    .line 1551
    .line 1552
    const/4 v1, 0x1

    .line 1553
    iput-boolean v1, v0, Ldefpackage/z64;->a0:Z

    .line 1554
    .line 1555
    :cond_5e
    iget-object v1, v0, Ldefpackage/z64;->c0:Ldefpackage/hw4;

    .line 1556
    .line 1557
    if-eqz v1, :cond_5f

    .line 1558
    .line 1559
    invoke-virtual {v0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v2

    .line 1563
    iget-object v3, v1, Ldefpackage/hw4;->g:Ldefpackage/sk4;

    .line 1564
    .line 1565
    if-nez v3, :cond_5f

    .line 1566
    .line 1567
    new-instance v3, Ldefpackage/x70;

    .line 1568
    .line 1569
    const/4 v4, 0x0

    .line 1570
    invoke-direct {v3, v1, v4}, Ldefpackage/x70;-><init>(Ldefpackage/hw4;Ldefpackage/vd0;)V

    .line 1571
    .line 1572
    .line 1573
    invoke-static {v2, v4, v4, v3, v11}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v2

    .line 1577
    iput-object v2, v1, Ldefpackage/hw4;->g:Ldefpackage/sk4;

    .line 1578
    .line 1579
    :cond_5f
    iget-object v0, v0, Ldefpackage/z64;->c0:Ldefpackage/hw4;

    .line 1580
    .line 1581
    if-eqz v0, :cond_65

    .line 1582
    .line 1583
    iget v1, v15, Ldefpackage/kn3;->c:I

    .line 1584
    .line 1585
    if-ne v1, v12, :cond_60

    .line 1586
    .line 1587
    goto :goto_2c

    .line 1588
    :cond_60
    if-ne v1, v8, :cond_61

    .line 1589
    .line 1590
    goto :goto_2c

    .line 1591
    :cond_61
    const/16 v2, 0xc

    .line 1592
    .line 1593
    if-ne v1, v2, :cond_65

    .line 1594
    .line 1595
    :goto_2c
    iget-object v1, v15, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 1596
    .line 1597
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1598
    .line 1599
    .line 1600
    move-result v2

    .line 1601
    const/4 v3, 0x0

    .line 1602
    :goto_2d
    if-ge v3, v2, :cond_63

    .line 1603
    .line 1604
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v4

    .line 1608
    check-cast v4, Ldefpackage/on3;

    .line 1609
    .line 1610
    invoke-virtual {v4}, Ldefpackage/on3;->c()Z

    .line 1611
    .line 1612
    .line 1613
    move-result v4

    .line 1614
    if-eqz v4, :cond_62

    .line 1615
    .line 1616
    goto :goto_2e

    .line 1617
    :cond_62
    add-int/lit8 v3, v3, 0x1

    .line 1618
    .line 1619
    goto :goto_2d

    .line 1620
    :cond_63
    if-ne v9, v14, :cond_64

    .line 1621
    .line 1622
    iget-boolean v1, v0, Ldefpackage/ir2;->a:Z

    .line 1623
    .line 1624
    if-eqz v1, :cond_64

    .line 1625
    .line 1626
    invoke-virtual {v0, v15}, Ldefpackage/hw4;->F(Ldefpackage/kn3;)Z

    .line 1627
    .line 1628
    .line 1629
    invoke-static {v15}, Ldefpackage/ir2;->a(Ldefpackage/kn3;)V

    .line 1630
    .line 1631
    .line 1632
    :cond_64
    if-ne v9, v10, :cond_65

    .line 1633
    .line 1634
    iget-boolean v1, v0, Ldefpackage/ir2;->a:Z

    .line 1635
    .line 1636
    if-nez v1, :cond_65

    .line 1637
    .line 1638
    invoke-virtual {v0, v15}, Ldefpackage/hw4;->F(Ldefpackage/kn3;)Z

    .line 1639
    .line 1640
    .line 1641
    move-result v0

    .line 1642
    if-eqz v0, :cond_65

    .line 1643
    .line 1644
    invoke-static {v15}, Ldefpackage/ir2;->a(Ldefpackage/kn3;)V

    .line 1645
    .line 1646
    .line 1647
    :cond_65
    :goto_2e
    return-void
.end method

.method public final q(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Ldefpackage/z64;->F:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ldefpackage/fh0;->a(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sget-wide v4, Ldefpackage/g42;->n:J

    .line 15
    .line 16
    invoke-static {v2, v3, v4, v5}, Ldefpackage/g42;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Ldefpackage/fh0;->a(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    sget-wide v4, Ldefpackage/g42;->m:J

    .line 31
    .line 32
    invoke-static {v2, v3, v4, v5}, Ldefpackage/g42;->a(JJ)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    :cond_0
    invoke-static {p1}, Ldefpackage/hw;->n(Landroid/view/KeyEvent;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v2, 0x2

    .line 43
    if-ne v0, v2, :cond_5

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    iget-object v0, p0, Ldefpackage/z64;->e0:Ldefpackage/g74;

    .line 52
    .line 53
    iget-object v0, v0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 54
    .line 55
    sget-object v2, Ldefpackage/hb3;->n:Ldefpackage/hb3;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-ne v0, v2, :cond_1

    .line 59
    .line 60
    move v1, v3

    .line 61
    :cond_1
    const/4 v0, 0x0

    .line 62
    const/16 v2, 0x20

    .line 63
    .line 64
    const-wide v4, 0xffffffffL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    iget-object v6, p0, Ldefpackage/z64;->h0:Ldefpackage/gd0;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v6}, Ldefpackage/gd0;->r0()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    and-long/2addr v6, v4

    .line 78
    long-to-int v1, v6

    .line 79
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {p1}, Ldefpackage/fh0;->a(I)J

    .line 84
    .line 85
    .line 86
    move-result-wide v6

    .line 87
    sget-wide v8, Ldefpackage/g42;->m:J

    .line 88
    .line 89
    invoke-static {v6, v7, v8, v9}, Ldefpackage/g42;->a(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    int-to-float p1, v1

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    int-to-float p1, v1

    .line 98
    neg-float p1, p1

    .line 99
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    int-to-long v0, v0

    .line 104
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-long v6, p1

    .line 109
    shl-long/2addr v0, v2

    .line 110
    and-long/2addr v4, v6

    .line 111
    or-long/2addr v0, v4

    .line 112
    :goto_1
    move-wide v6, v0

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    invoke-virtual {v6}, Ldefpackage/gd0;->r0()J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    shr-long/2addr v6, v2

    .line 119
    long-to-int v1, v6

    .line 120
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-static {p1}, Ldefpackage/fh0;->a(I)J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    sget-wide v8, Ldefpackage/g42;->m:J

    .line 129
    .line 130
    invoke-static {v6, v7, v8, v9}, Ldefpackage/g42;->a(JJ)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    int-to-float p1, v1

    .line 137
    goto :goto_2

    .line 138
    :cond_4
    int-to-float p1, v1

    .line 139
    neg-float p1, p1

    .line 140
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    int-to-long v6, p1

    .line 145
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    int-to-long v0, p1

    .line 150
    shl-long/2addr v6, v2

    .line 151
    and-long/2addr v0, v4

    .line 152
    or-long/2addr v0, v6

    .line 153
    goto :goto_1

    .line 154
    :goto_3
    invoke-virtual {p0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance v4, Ldefpackage/j2;

    .line 159
    .line 160
    const/4 v9, 0x1

    .line 161
    const/4 v8, 0x0

    .line 162
    move-object v5, p0

    .line 163
    invoke-direct/range {v4 .. v9}, Ldefpackage/j2;-><init>(Ldefpackage/z64;JLdefpackage/vd0;I)V

    .line 164
    .line 165
    .line 166
    const/4 p0, 0x3

    .line 167
    invoke-static {p1, v8, v8, v4, p0}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 168
    .line 169
    .line 170
    return v3

    .line 171
    :cond_5
    return v1
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/z64;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/z64;->x0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Ldefpackage/z64;->J:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/z64;->B0()Ldefpackage/y00;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ldefpackage/wu0;->a:Ldefpackage/wu0;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Ldefpackage/z64;->T:Ldefpackage/rm2;

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Ldefpackage/z64;->K:Z

    .line 26
    .line 27
    return-void
.end method

.method public final w0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/z64;->G:Ldefpackage/rm2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Ldefpackage/iv0;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Ldefpackage/iv0;-><init>(Ldefpackage/jv0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ldefpackage/rm2;->l(Ldefpackage/q02;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Ldefpackage/z64;->I:Ldefpackage/jv0;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final x0()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Ldefpackage/z64;->M:J

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/z64;->L:Ldefpackage/su0;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/ru0;->p:Ldefpackage/ru0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ldefpackage/su0;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Ldefpackage/su0;->f:Ldefpackage/ru0;

    .line 18
    .line 19
    iput-boolean v2, v0, Ldefpackage/su0;->g:Z

    .line 20
    .line 21
    iput-boolean v2, v0, Ldefpackage/su0;->h:Z

    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/z64;->L:Ldefpackage/su0;

    .line 24
    .line 25
    :cond_0
    iput-object v1, v0, Ldefpackage/su0;->f:Ldefpackage/ru0;

    .line 26
    .line 27
    iput-boolean v2, v0, Ldefpackage/su0;->g:Z

    .line 28
    .line 29
    iput-boolean v2, v0, Ldefpackage/su0;->h:Z

    .line 30
    .line 31
    iput-object v0, p0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 32
    .line 33
    return-void
.end method

.method public final y0(Ldefpackage/on3;JLdefpackage/e20;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/z64;->R:Ldefpackage/tu0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/tu0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Ldefpackage/tu0;->f:Ldefpackage/on3;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Ldefpackage/tu0;->g:J

    .line 19
    .line 20
    iput-object v0, p0, Ldefpackage/z64;->R:Ldefpackage/tu0;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Ldefpackage/tu0;->f:Ldefpackage/on3;

    .line 23
    .line 24
    iput-wide p2, v0, Ldefpackage/tu0;->g:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Ldefpackage/e20;->o:J

    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/z64;->S:Ldefpackage/ya4;

    .line 31
    .line 32
    return-void
.end method
