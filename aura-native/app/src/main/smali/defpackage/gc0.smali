.class public final Ldefpackage/gc0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/p81;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/gc0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/gc0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/gc0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 5
    .line 6
    iget-object v3, p0, Ldefpackage/gc0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v4, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v6, v3

    .line 14
    check-cast v6, [Ldefpackage/p81;

    .line 15
    .line 16
    new-instance v7, Ldefpackage/zf0;

    .line 17
    .line 18
    const/16 p0, 0x8

    .line 19
    .line 20
    invoke-direct {v7, p0, v6}, Ldefpackage/zf0;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v8, Ldefpackage/kc5;

    .line 24
    .line 25
    const/4 p0, 0x3

    .line 26
    invoke-direct {v8, p0, v1}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 27
    .line 28
    .line 29
    new-instance v5, Ldefpackage/c60;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    move-object v9, p1

    .line 33
    invoke-direct/range {v5 .. v10}, Ldefpackage/c60;-><init>([Ldefpackage/p81;Ldefpackage/zf0;Ldefpackage/kc5;Ldefpackage/q81;Ldefpackage/vd0;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Ldefpackage/s81;

    .line 37
    .line 38
    invoke-interface {p2}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, p2, p1}, Ldefpackage/e64;-><init>(Ldefpackage/vd0;Ldefpackage/ne0;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p0, v5}, Ldefpackage/h12;->O(Ldefpackage/e64;Ldefpackage/e64;Ldefpackage/wf1;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object p0, v4

    .line 53
    :goto_0
    if-ne p0, v2, :cond_1

    .line 54
    .line 55
    move-object v4, p0

    .line 56
    :cond_1
    return-object v4

    .line 57
    :pswitch_0
    move-object v9, p1

    .line 58
    instance-of p1, p2, Ldefpackage/e0;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    move-object p1, p2

    .line 63
    check-cast p1, Ldefpackage/e0;

    .line 64
    .line 65
    iget v0, p1, Ldefpackage/e0;->q:I

    .line 66
    .line 67
    const/high16 v5, -0x80000000

    .line 68
    .line 69
    and-int v6, v0, v5

    .line 70
    .line 71
    if-eqz v6, :cond_2

    .line 72
    .line 73
    sub-int/2addr v0, v5

    .line 74
    iput v0, p1, Ldefpackage/e0;->q:I

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    new-instance p1, Ldefpackage/e0;

    .line 78
    .line 79
    invoke-direct {p1, p0, p2}, Ldefpackage/e0;-><init>(Ldefpackage/gc0;Ldefpackage/vd0;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-object p0, p1, Ldefpackage/e0;->o:Ljava/lang/Object;

    .line 83
    .line 84
    iget p2, p1, Ldefpackage/e0;->q:I

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    if-ne p2, v0, :cond_3

    .line 90
    .line 91
    iget-object p1, p1, Ldefpackage/e0;->n:Ldefpackage/a44;

    .line 92
    .line 93
    :try_start_0
    invoke-static {p0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    move-object p0, v0

    .line 99
    goto :goto_6

    .line 100
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 101
    .line 102
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    invoke-static {p0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-instance p0, Ldefpackage/a44;

    .line 110
    .line 111
    invoke-interface {p1}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-direct {p0, v9, p2}, Ldefpackage/a44;-><init>(Ldefpackage/q81;Ldefpackage/ne0;)V

    .line 116
    .line 117
    .line 118
    :try_start_1
    iput-object p0, p1, Ldefpackage/e0;->n:Ldefpackage/a44;

    .line 119
    .line 120
    iput v0, p1, Ldefpackage/e0;->q:I

    .line 121
    .line 122
    check-cast v3, Ldefpackage/wf1;

    .line 123
    .line 124
    invoke-interface {v3, p0, p1}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    if-ne p1, v2, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    move-object p1, v4

    .line 132
    :goto_2
    if-ne p1, v2, :cond_6

    .line 133
    .line 134
    move-object v1, v2

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    move-object p1, p0

    .line 137
    :goto_3
    invoke-virtual {p1}, Ldefpackage/wd0;->releaseIntercepted()V

    .line 138
    .line 139
    .line 140
    move-object v1, v4

    .line 141
    :goto_4
    return-object v1

    .line 142
    :goto_5
    move-object v11, p1

    .line 143
    move-object p1, p0

    .line 144
    move-object p0, v11

    .line 145
    goto :goto_6

    .line 146
    :catchall_1
    move-exception v0

    .line 147
    move-object p1, v0

    .line 148
    goto :goto_5

    .line 149
    :goto_6
    invoke-virtual {p1}, Ldefpackage/wd0;->releaseIntercepted()V

    .line 150
    .line 151
    .line 152
    throw p0

    .line 153
    :pswitch_1
    move-object v9, p1

    .line 154
    check-cast v3, Ldefpackage/x81;

    .line 155
    .line 156
    new-instance p0, Ldefpackage/fc0;

    .line 157
    .line 158
    const/4 p1, 0x0

    .line 159
    invoke-direct {p0, p1, v9}, Ldefpackage/fc0;-><init>(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, p0, p2}, Ldefpackage/x81;->a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v2, :cond_7

    .line 167
    .line 168
    move-object v4, p0

    .line 169
    :cond_7
    return-object v4

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
