.class public final Lx82;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lg94;


# instance fields
.field public B:Lgf1;

.field public C:Ls82;

.field public D:Z

.field public E:Lh64;

.field public final F:Lu82;

.field public G:Lu82;


# direct methods
.method public constructor <init>(Lgf1;Ls82;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcx2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx82;->B:Lgf1;

    .line 5
    .line 6
    iput-object p2, p0, Lx82;->C:Ls82;

    .line 7
    .line 8
    iput-boolean p3, p0, Lx82;->D:Z

    .line 9
    .line 10
    new-instance p1, Lu82;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p0, p2}, Lu82;-><init>(Lx82;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lx82;->F:Lu82;

    .line 17
    .line 18
    invoke-virtual {p0}, Lx82;->q0()V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final c0(Lq94;)V
    .locals 7

    .line 1
    sget-object v0, Lo94;->a:[Lc42;

    .line 2
    .line 3
    sget-object v0, Ln94;->m:Lp94;

    .line 4
    .line 5
    sget-object v1, Lo94;->a:[Lc42;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    aget-object v2, v1, v2

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0, v2}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lx82;->F:Lu82;

    .line 19
    .line 20
    sget-object v2, Ln94;->L:Lp94;

    .line 21
    .line 22
    invoke-interface {p1, v2, v0}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lx82;->E:Lh64;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    sget-object v3, Ln94;->u:Lp94;

    .line 31
    .line 32
    const/16 v4, 0xc

    .line 33
    .line 34
    aget-object v4, v1, v4

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v3, v0}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lx82;->G:Lu82;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    sget-object v3, Ld94;->f:Lp94;

    .line 47
    .line 48
    new-instance v4, Lw2;

    .line 49
    .line 50
    invoke-direct {v4, v2, v0}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v3, v4}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    new-instance v0, Lv82;

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-direct {v0, p0, v3}, Lv82;-><init>(Lx82;I)V

    .line 60
    .line 61
    .line 62
    sget-object v3, Ld94;->B:Lp94;

    .line 63
    .line 64
    new-instance v4, Lw2;

    .line 65
    .line 66
    new-instance v5, Lkl3;

    .line 67
    .line 68
    const/4 v6, 0x7

    .line 69
    invoke-direct {v5, v6, v0}, Lkl3;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v4, v2, v5}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v3, v4}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lx82;->C:Ls82;

    .line 79
    .line 80
    iget-boolean v0, p0, Ls82;->b:Z

    .line 81
    .line 82
    iget-object p0, p0, Ls82;->a:Llm0;

    .line 83
    .line 84
    const/4 v2, 0x1

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    new-instance v0, Lo40;

    .line 88
    .line 89
    invoke-virtual {p0}, Llm0;->n()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-direct {v0, p0, v2}, Lo40;-><init>(II)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    new-instance v0, Lo40;

    .line 98
    .line 99
    invoke-virtual {p0}, Llm0;->n()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-direct {v0, v2, p0}, Lo40;-><init>(II)V

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object p0, Ln94;->f:Lp94;

    .line 107
    .line 108
    const/16 v2, 0x18

    .line 109
    .line 110
    aget-object v1, v1, v2

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, p0, v0}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_2
    const-string p0, "scrollAxisRange"

    .line 120
    .line 121
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v2
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0()V
    .locals 4

    .line 1
    new-instance v0, Lh64;

    .line 2
    .line 3
    new-instance v1, Lv82;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lv82;-><init>(Lx82;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lv82;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, Lv82;-><init>(Lx82;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lh64;-><init>(Lv82;Lv82;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lx82;->E:Lh64;

    .line 19
    .line 20
    iget-boolean v0, p0, Lx82;->D:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Lu82;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Lu82;-><init>(Lx82;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Lx82;->G:Lu82;

    .line 33
    .line 34
    return-void
.end method
