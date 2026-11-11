.class public final Lgd3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ly71;


# instance fields
.field public final a:Lwg4;

.field public final b:Llm0;


# direct methods
.method public constructor <init>(Lwg4;Llm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgd3;->a:Lwg4;

    .line 5
    .line 6
    iput-object p2, p0, Lgd3;->b:Llm0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lc74;FLvd0;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lfd3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lfd3;

    .line 7
    .line 8
    iget v1, v0, Lfd3;->p:I

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
    iput v1, v0, Lfd3;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfd3;

    .line 21
    .line 22
    check-cast p3, Lwd0;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lfd3;-><init>(Lgd3;Lwd0;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lfd3;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lfd3;->p:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Lx;

    .line 51
    .line 52
    const/16 v1, 0x1b

    .line 53
    .line 54
    invoke-direct {p3, v1, p0, p1}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput v3, v0, Lfd3;->p:I

    .line 58
    .line 59
    iget-object v1, p0, Lgd3;->a:Lwg4;

    .line 60
    .line 61
    invoke-virtual {v1, p1, p2, p3, v0}, Lwg4;->d(Lq64;FLif1;Lwd0;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    sget-object p1, Lxe0;->n:Lxe0;

    .line 66
    .line 67
    if-ne p3, p1, :cond_3

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget-object p0, p0, Lgd3;->b:Llm0;

    .line 77
    .line 78
    invoke-virtual {p0}, Lad3;->l()F

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/4 p3, 0x0

    .line 83
    cmpg-float p2, p2, p3

    .line 84
    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-virtual {p0}, Lad3;->l()F

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    float-to-double v0, p2

    .line 97
    const-wide v3, 0x3f50624dd2f1a9fcL    # 0.001

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    cmpg-double p2, v0, v3

    .line 103
    .line 104
    if-gez p2, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0}, Lad3;->k()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iget-object v0, p0, Lad3;->k:Lml3;

    .line 111
    .line 112
    invoke-virtual {v0}, Lml3;->a()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    iget-object v0, p0, Lad3;->m:Lzd3;

    .line 119
    .line 120
    invoke-virtual {v0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lqc3;

    .line 125
    .line 126
    iget-object v0, v0, Lqc3;->s:Lwe0;

    .line 127
    .line 128
    new-instance v1, Lkc3;

    .line 129
    .line 130
    const/4 v3, 0x2

    .line 131
    invoke-direct {v1, p0, v2, v3}, Lkc3;-><init>(Llm0;Lvd0;I)V

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x3

    .line 135
    invoke-static {v0, v2, v2, v1, v3}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 136
    .line 137
    .line 138
    :cond_5
    const/4 v0, 0x0

    .line 139
    invoke-virtual {p0, p3, p2, v0}, Lad3;->t(FIZ)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lad3;->l()F

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    new-instance p2, Ljava/lang/Float;

    .line 148
    .line 149
    invoke-direct {p2, p0}, Ljava/lang/Float;-><init>(F)V

    .line 150
    .line 151
    .line 152
    :goto_3
    new-instance p0, Ljava/lang/Float;

    .line 153
    .line 154
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 155
    .line 156
    .line 157
    return-object p0
.end method
