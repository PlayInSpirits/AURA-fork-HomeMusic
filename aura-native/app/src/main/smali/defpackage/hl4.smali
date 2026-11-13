.class public final Ldefpackage/hl4;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xf1;


# instance fields
.field public o:I

.field public synthetic p:Ldefpackage/q81;

.field public synthetic q:I

.field public final synthetic r:Ldefpackage/il4;


# direct methods
.method public constructor <init>(Ldefpackage/il4;Ldefpackage/vd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/hl4;->r:Ldefpackage/il4;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ldefpackage/q81;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ldefpackage/vd0;

    .line 10
    .line 11
    new-instance v0, Ldefpackage/hl4;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/hl4;->r:Ldefpackage/il4;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, Ldefpackage/hl4;-><init>(Ldefpackage/il4;Ldefpackage/vd0;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 19
    .line 20
    iput p2, v0, Ldefpackage/hl4;->q:I

    .line 21
    .line 22
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ldefpackage/hl4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ldefpackage/hl4;->o:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    sget-object v7, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eq v0, v6, :cond_4

    .line 14
    .line 15
    if-eq v0, v5, :cond_3

    .line 16
    .line 17
    if-eq v0, v4, :cond_2

    .line 18
    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    iget-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 31
    .line 32
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    iget-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 37
    .line 38
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    iget-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 43
    .line 44
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    :goto_0
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 56
    .line 57
    iget p1, p0, Ldefpackage/hl4;->q:I

    .line 58
    .line 59
    if-lez p1, :cond_6

    .line 60
    .line 61
    iput v6, p0, Ldefpackage/hl4;->o:I

    .line 62
    .line 63
    sget-object p1, Ldefpackage/gd4;->n:Ldefpackage/gd4;

    .line 64
    .line 65
    invoke-interface {v0, p1, p0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v7, :cond_a

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_6
    iput-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 73
    .line 74
    iput v5, p0, Ldefpackage/hl4;->o:I

    .line 75
    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    invoke-static {v5, v6, p0}, Ldefpackage/au0;->j(JLdefpackage/wd0;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v7, :cond_7

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_7
    :goto_1
    iput-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 86
    .line 87
    iput v4, p0, Ldefpackage/hl4;->o:I

    .line 88
    .line 89
    sget-object p1, Ldefpackage/gd4;->o:Ldefpackage/gd4;

    .line 90
    .line 91
    invoke-interface {v0, p1, p0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-ne p1, v7, :cond_8

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_8
    :goto_2
    iput-object v0, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 99
    .line 100
    iput v3, p0, Ldefpackage/hl4;->o:I

    .line 101
    .line 102
    const-wide v3, 0x7fffffffffffffffL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v3, v4, p0}, Ldefpackage/au0;->j(JLdefpackage/wd0;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v7, :cond_9

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_9
    :goto_3
    iput-object v1, p0, Ldefpackage/hl4;->p:Ldefpackage/q81;

    .line 115
    .line 116
    iput v2, p0, Ldefpackage/hl4;->o:I

    .line 117
    .line 118
    sget-object p1, Ldefpackage/gd4;->p:Ldefpackage/gd4;

    .line 119
    .line 120
    invoke-interface {v0, p1, p0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-ne p0, v7, :cond_a

    .line 125
    .line 126
    :goto_4
    return-object v7

    .line 127
    :cond_a
    :goto_5
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 128
    .line 129
    return-object p0
.end method
