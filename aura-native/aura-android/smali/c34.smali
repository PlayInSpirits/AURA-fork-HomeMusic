.class public final Lc34;
.super Lz62;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Lc34;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc34;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lc34;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc34;->b:Lc34;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc34;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcf2;Ljava/util/List;J)Lvi2;
    .locals 8

    .line 1
    iget p0, p0, Lc34;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p1, "Undefined measure and it is required"

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    sget-object v0, Lv01;->n:Lv01;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eq p0, v1, :cond_1

    .line 25
    .line 26
    new-instance p0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    move v4, v2

    .line 40
    move v5, v4

    .line 41
    :goto_0
    if-ge v2, v3, :cond_0

    .line 42
    .line 43
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Lpi2;

    .line 48
    .line 49
    invoke-interface {v6, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    iget v7, v6, Ljg3;->n:I

    .line 54
    .line 55
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iget v7, v6, Ljg3;->o:I

    .line 60
    .line 61
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-static {v4, p3, p4}, Lqc0;->f(IJ)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {v5, p3, p4}, Lqc0;->e(IJ)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    new-instance p4, Loc3;

    .line 80
    .line 81
    invoke-direct {p4, v1, p0}, Loc3;-><init>(ILjava/util/ArrayList;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, p2, p3, v0, p4}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Lpi2;

    .line 94
    .line 95
    invoke-interface {p0, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget p2, p0, Ljg3;->n:I

    .line 100
    .line 101
    invoke-static {p2, p3, p4}, Lqc0;->f(IJ)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget v1, p0, Ljg3;->o:I

    .line 106
    .line 107
    invoke-static {v1, p3, p4}, Lqc0;->e(IJ)I

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    new-instance p4, Lla;

    .line 112
    .line 113
    const/4 v1, 0x4

    .line 114
    invoke-direct {p4, p0, v1}, Lla;-><init>(Ljg3;I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p1, p2, p3, v0, p4}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    goto :goto_1

    .line 122
    :cond_2
    invoke-static {p3, p4}, Lnc0;->j(J)I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-static {p3, p4}, Lnc0;->i(J)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    new-instance p3, Lor1;

    .line 131
    .line 132
    const/16 p4, 0x18

    .line 133
    .line 134
    invoke-direct {p3, p4}, Lor1;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1, p0, p2, v0, p3}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :goto_1
    return-object p0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
