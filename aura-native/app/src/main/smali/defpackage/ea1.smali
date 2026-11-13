.class public final Ldefpackage/ea1;
.super Ldefpackage/fo0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/g94;
.implements Ldefpackage/vi1;
.implements Ldefpackage/a90;
.implements Ldefpackage/b83;
.implements Ldefpackage/rx4;


# static fields
.field public static final J:Ldefpackage/y41;


# instance fields
.field public D:Ldefpackage/rm2;

.field public final E:Ldefpackage/q;

.field public F:Ldefpackage/p91;

.field public G:Ldefpackage/l82;

.field public H:Ldefpackage/f63;

.field public final I:Ldefpackage/ba1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/y41;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/y41;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/ea1;->J:Ldefpackage/y41;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ldefpackage/q;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ldefpackage/fo0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ldefpackage/ea1;->D:Ldefpackage/rm2;

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/ea1;->E:Ldefpackage/q;

    .line 8
    .line 9
    new-instance v1, Ldefpackage/da1;

    .line 10
    .line 11
    const-string v7, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    const-class v4, Ldefpackage/ea1;

    .line 16
    .line 17
    const-string v6, "onFocusStateChange"

    .line 18
    .line 19
    move-object v5, p0

    .line 20
    invoke-direct/range {v1 .. v7}, Ldefpackage/hg1;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Ldefpackage/ba1;

    .line 24
    .line 25
    const/16 p1, 0xa

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, v0, v1, p1}, Ldefpackage/ba1;-><init>(ILdefpackage/wf1;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, p0}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 32
    .line 33
    .line 34
    iput-object p0, v5, Ldefpackage/ea1;->I:Ldefpackage/ba1;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final L(Ldefpackage/f63;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/ea1;->H:Ldefpackage/f63;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ea1;->I:Ldefpackage/ba1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ldefpackage/z91;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-boolean p1, p1, Ldefpackage/cx2;->A:Z

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Ldefpackage/ea1;->H:Ldefpackage/f63;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-boolean p1, p1, Ldefpackage/cx2;->A:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Ldefpackage/ea1;->u0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Ldefpackage/ea1;->u0()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final Q()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/jx3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/fa;

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-direct {v1, v2, v0, p0}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Ldefpackage/j51;->F(Ldefpackage/cx2;Ldefpackage/gf1;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ldefpackage/l82;

    .line 18
    .line 19
    iget-object v1, p0, Ldefpackage/ea1;->I:Ldefpackage/ba1;

    .line 20
    .line 21
    invoke-virtual {v1}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ldefpackage/z91;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Ldefpackage/ea1;->G:Ldefpackage/l82;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ldefpackage/l82;->b()V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ldefpackage/l82;->a()Ldefpackage/l82;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :goto_0
    iput-object v0, p0, Ldefpackage/ea1;->G:Ldefpackage/l82;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final c0(Ldefpackage/q94;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/ea1;->I:Ldefpackage/ba1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ldefpackage/z91;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Ldefpackage/o94;->a:[Ldefpackage/c42;

    .line 12
    .line 13
    sget-object v1, Ldefpackage/n94;->l:Ldefpackage/p94;

    .line 14
    .line 15
    sget-object v2, Ldefpackage/o94;->a:[Ldefpackage/c42;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    aget-object v2, v2, v3

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1, v0}, Ldefpackage/q94;->a(Ldefpackage/p94;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Ldefpackage/na;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x2

    .line 34
    const/4 v3, 0x0

    .line 35
    const-class v5, Ldefpackage/ea1;

    .line 36
    .line 37
    const-string v6, "requestFocus"

    .line 38
    .line 39
    const-string v7, "requestFocus()Z"

    .line 40
    .line 41
    move-object v4, p0

    .line 42
    invoke-direct/range {v2 .. v9}, Ldefpackage/na;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Ldefpackage/d94;->v:Ldefpackage/p94;

    .line 46
    .line 47
    new-instance v0, Ldefpackage/w2;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1, v2}, Ldefpackage/w2;-><init>(Ljava/lang/String;Ldefpackage/sf1;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, p0, v0}, Ldefpackage/q94;->a(Ldefpackage/p94;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/ea1;->J:Ldefpackage/y41;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ea1;->G:Ldefpackage/l82;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/l82;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldefpackage/ea1;->G:Ldefpackage/l82;

    .line 10
    .line 11
    return-void
.end method

.method public final t0(Ldefpackage/rm2;Ldefpackage/q02;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ldefpackage/cx2;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ldefpackage/we0;->e()Ldefpackage/ne0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ldefpackage/s22;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, Ldefpackage/o;

    .line 25
    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-direct {v1, v2, p1, p2}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Ldefpackage/s22;->M(Ldefpackage/if1;)Ldefpackage/as0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v4, v5

    .line 38
    :goto_0
    invoke-virtual {p0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v1, Ldefpackage/r;

    .line 43
    .line 44
    const/4 v6, 0x6

    .line 45
    move-object v2, p1

    .line 46
    move-object v3, p2

    .line 47
    invoke-direct/range {v1 .. v6}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x3

    .line 51
    invoke-static {p0, v5, v5, v1, p1}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object v2, p1

    .line 56
    move-object v3, p2

    .line 57
    invoke-virtual {v2, v3}, Ldefpackage/rm2;->l(Ldefpackage/q02;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final u0()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Ldefpackage/cx2;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 6
    .line 7
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    invoke-static {v0}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 17
    .line 18
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    if-eqz p0, :cond_c

    .line 25
    .line 26
    iget-object v1, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 27
    .line 28
    iget-object v1, v1, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ldefpackage/cx2;

    .line 31
    .line 32
    iget v1, v1, Ldefpackage/cx2;->q:I

    .line 33
    .line 34
    const/high16 v2, 0x40000

    .line 35
    .line 36
    and-int/2addr v1, v2

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v1, :cond_a

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_a

    .line 41
    .line 42
    iget v1, v0, Ldefpackage/cx2;->p:I

    .line 43
    .line 44
    and-int/2addr v1, v2

    .line 45
    if-eqz v1, :cond_9

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    move-object v4, v3

    .line 49
    :goto_2
    if-eqz v1, :cond_9

    .line 50
    .line 51
    instance-of v5, v1, Ldefpackage/rx4;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    move-object v5, v1

    .line 56
    check-cast v5, Ldefpackage/rx4;

    .line 57
    .line 58
    invoke-interface {v5}, Ldefpackage/rx4;->f()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Ldefpackage/fa1;->B:Ldefpackage/y41;

    .line 63
    .line 64
    if-eq v6, v5, :cond_1

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_1
    return-void

    .line 68
    :cond_2
    :goto_3
    iget v5, v1, Ldefpackage/cx2;->p:I

    .line 69
    .line 70
    and-int/2addr v5, v2

    .line 71
    if-eqz v5, :cond_8

    .line 72
    .line 73
    instance-of v5, v1, Ldefpackage/fo0;

    .line 74
    .line 75
    if-eqz v5, :cond_8

    .line 76
    .line 77
    move-object v5, v1

    .line 78
    check-cast v5, Ldefpackage/fo0;

    .line 79
    .line 80
    iget-object v5, v5, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    :goto_4
    const/4 v7, 0x1

    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    iget v8, v5, Ldefpackage/cx2;->p:I

    .line 87
    .line 88
    and-int/2addr v8, v2

    .line 89
    if-eqz v8, :cond_6

    .line 90
    .line 91
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    if-ne v6, v7, :cond_3

    .line 94
    .line 95
    move-object v1, v5

    .line 96
    goto :goto_5

    .line 97
    :cond_3
    if-nez v4, :cond_4

    .line 98
    .line 99
    new-instance v4, Ldefpackage/f13;

    .line 100
    .line 101
    const/16 v7, 0x10

    .line 102
    .line 103
    new-array v7, v7, [Ldefpackage/cx2;

    .line 104
    .line 105
    invoke-direct {v4, v7}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {v4, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v3

    .line 114
    :cond_5
    invoke-virtual {v4, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_5
    iget-object v5, v5, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    if-ne v6, v7, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    invoke-static {v4}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    goto :goto_2

    .line 128
    :cond_9
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_a
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-eqz p0, :cond_b

    .line 136
    .line 137
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 138
    .line 139
    if-eqz v0, :cond_b

    .line 140
    .line 141
    iget-object v0, v0, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Ldefpackage/sq4;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_b
    move-object v0, v3

    .line 147
    goto :goto_0

    .line 148
    :cond_c
    return-void
.end method

.method public final v0(Ldefpackage/rm2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ea1;->D:Ldefpackage/rm2;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/ea1;->D:Ldefpackage/rm2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/ea1;->F:Ldefpackage/p91;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ldefpackage/q91;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ldefpackage/rm2;->l(Ldefpackage/q02;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Ldefpackage/ea1;->F:Ldefpackage/p91;

    .line 27
    .line 28
    iput-object p1, p0, Ldefpackage/ea1;->D:Ldefpackage/rm2;

    .line 29
    .line 30
    :cond_1
    return-void
.end method
