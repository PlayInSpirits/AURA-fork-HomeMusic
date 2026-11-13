.class public final synthetic Ldefpackage/fp1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldefpackage/gp1;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/gp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/fp1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/fp1;->b:Ldefpackage/gp1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/fp1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/fp1;->b:Ldefpackage/gp1;

    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/gp1;->l0:Ldefpackage/up0;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    iget-object p0, v0, Ldefpackage/up0;->b:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, v0, Ldefpackage/up0;->b:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v1, v2

    .line 37
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p0, p0, Ldefpackage/gp1;->o0:Ldefpackage/en3;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Ldefpackage/c7;

    .line 47
    .line 48
    const/16 v1, 0xe

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ldefpackage/c7;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ljava/util/List;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ldefpackage/en3;->p(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    return-void

    .line 71
    :pswitch_0
    iget-object v0, p0, Ldefpackage/gp1;->l0:Ldefpackage/up0;

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    iget-object p0, v0, Ldefpackage/up0;->d:Landroid/view/View;

    .line 78
    .line 79
    check-cast p0, Landroid/widget/LinearLayout;

    .line 80
    .line 81
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    if-eqz v0, :cond_6

    .line 86
    .line 87
    iget-object v0, v0, Ldefpackage/up0;->d:Landroid/view/View;

    .line 88
    .line 89
    check-cast v0, Landroid/widget/LinearLayout;

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_5

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move v1, v2

    .line 99
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    :cond_6
    iget-object p0, p0, Ldefpackage/gp1;->p0:Ldefpackage/zd0;

    .line 103
    .line 104
    iput-object p1, p0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 107
    .line 108
    .line 109
    :cond_7
    :goto_3
    return-void

    .line 110
    :pswitch_1
    iget-object v0, p0, Ldefpackage/gp1;->l0:Ldefpackage/up0;

    .line 111
    .line 112
    if-nez p1, :cond_9

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    iget-object p1, v0, Ldefpackage/up0;->d:Landroid/view/View;

    .line 117
    .line 118
    check-cast p1, Landroid/widget/LinearLayout;

    .line 119
    .line 120
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    :cond_8
    iget-object p0, p0, Ldefpackage/gp1;->l0:Ldefpackage/up0;

    .line 124
    .line 125
    if-eqz p0, :cond_d

    .line 126
    .line 127
    iget-object p0, p0, Ldefpackage/up0;->a:Landroid/view/ViewGroup;

    .line 128
    .line 129
    check-cast p0, Landroid/widget/LinearLayout;

    .line 130
    .line 131
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_9
    if-eqz v0, :cond_b

    .line 136
    .line 137
    iget-object v0, v0, Ldefpackage/up0;->d:Landroid/view/View;

    .line 138
    .line 139
    check-cast v0, Landroid/widget/LinearLayout;

    .line 140
    .line 141
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-nez v3, :cond_a

    .line 146
    .line 147
    move v3, v1

    .line 148
    goto :goto_4

    .line 149
    :cond_a
    move v3, v2

    .line 150
    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 151
    .line 152
    .line 153
    :cond_b
    iget-object p0, p0, Ldefpackage/gp1;->l0:Ldefpackage/up0;

    .line 154
    .line 155
    if-eqz p0, :cond_d

    .line 156
    .line 157
    iget-object p0, p0, Ldefpackage/up0;->a:Landroid/view/ViewGroup;

    .line 158
    .line 159
    check-cast p0, Landroid/widget/LinearLayout;

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_c

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_c
    move v1, v2

    .line 169
    :goto_5
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    :cond_d
    :goto_6
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
