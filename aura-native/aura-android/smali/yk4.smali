.class public final synthetic Lyk4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lf9;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lf9;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyk4;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyk4;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lyk4;->c:Lf9;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lyk4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    iget-object v3, p0, Lyk4;->c:Lf9;

    .line 6
    .line 7
    iget-object p0, p0, Lyk4;->b:Landroid/content/Context;

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p1}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v4, Lhu3;

    .line 35
    .line 36
    invoke-direct {v4, v2}, Lhu3;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {p1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/util/List;

    .line 52
    .line 53
    invoke-virtual {p0, v0, p1, v1}, Leu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {v3}, Ldg;->dismiss()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_0
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    invoke-static {p0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p1}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v4, Lhu3;

    .line 81
    .line 82
    invoke-direct {v4, v2}, Lhu3;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {p1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {p0, v0, p1, v1}, Leu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {v3}, Ldg;->dismiss()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_1
    if-eqz p1, :cond_2

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    invoke-static {p0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p1}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v4, Lhu3;

    .line 127
    .line 128
    invoke-direct {v4, v2}, Lhu3;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-interface {p1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {p0, v0, p1, v1}, Leu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 146
    .line 147
    .line 148
    :cond_2
    invoke-virtual {v3}, Ldg;->dismiss()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
