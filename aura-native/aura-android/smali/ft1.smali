.class public final synthetic Lft1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lad2;

.field public final synthetic o:Landroid/view/View;

.field public final synthetic p:Landroid/view/View;

.field public final synthetic q:Landroid/widget/TextView;

.field public final synthetic r:Landroid/widget/ImageButton;

.field public final synthetic s:Landroid/widget/TextView;

.field public final synthetic t:Lwj3;


# direct methods
.method public synthetic constructor <init>(Lk03;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageButton;Landroid/widget/TextView;Lwj3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lft1;->n:Lad2;

    .line 5
    .line 6
    iput-object p2, p0, Lft1;->o:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Lft1;->p:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Lft1;->q:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p5, p0, Lft1;->r:Landroid/widget/ImageButton;

    .line 13
    .line 14
    iput-object p6, p0, Lft1;->s:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Lft1;->t:Lwj3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lft1;->n:Lad2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 8
    .line 9
    iget-object v1, p0, Lft1;->o:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v4, v3

    .line 27
    :goto_0
    sget-object v5, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 28
    .line 29
    const-string v6, "liked"

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    :goto_1
    move-object v2, v3

    .line 34
    goto :goto_3

    .line 35
    :cond_1
    invoke-virtual {v5, v4}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getContext()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v4, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    const v4, 0x7f13023b

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getTitle()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    sget-object v4, Lcom/eddyizm/tempus/homemusic/a;->e:Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getContext()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    :cond_4
    if-eqz v4, :cond_6

    .line 79
    .line 80
    const v5, 0x7f13023c

    .line 81
    .line 82
    .line 83
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v2, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-nez v4, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    move-object v2, v4

    .line 95
    goto :goto_3

    .line 96
    :cond_6
    :goto_2
    const v4, 0x7f13023d

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    :goto_3
    iget-object v4, p0, Lft1;->p:Landroid/view/View;

    .line 107
    .line 108
    if-eqz v4, :cond_8

    .line 109
    .line 110
    if-eqz v2, :cond_7

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    goto :goto_4

    .line 114
    :cond_7
    const/16 v5, 0x8

    .line 115
    .line 116
    :goto_4
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    :cond_8
    if-eqz v2, :cond_c

    .line 120
    .line 121
    iget-object v4, p0, Lft1;->q:Landroid/widget/TextView;

    .line 122
    .line 123
    if-eqz v4, :cond_9

    .line 124
    .line 125
    const-string v5, "\u2728 "

    .line 126
    .line 127
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    :cond_9
    iget-object v2, p0, Lft1;->r:Landroid/widget/ImageButton;

    .line 135
    .line 136
    if-eqz v2, :cond_c

    .line 137
    .line 138
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    sget-object v5, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 143
    .line 144
    if-eqz v5, :cond_a

    .line 145
    .line 146
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getContext()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    goto :goto_5

    .line 151
    :cond_a
    move-object v5, v3

    .line 152
    :goto_5
    invoke-static {v5, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_b

    .line 157
    .line 158
    const v5, 0x7f130234

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_b
    const v5, 0x7f130235

    .line 163
    .line 164
    .line 165
    :goto_6
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v2, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    :cond_c
    if-eqz v0, :cond_d

    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :cond_d
    iget-object v0, p0, Lft1;->s:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-static {v0, v3}, Lfu;->p(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, Lft1;->t:Lwj3;

    .line 184
    .line 185
    invoke-virtual {p0}, Lwj3;->get()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    check-cast p0, Lqi3;

    .line 190
    .line 191
    invoke-static {v1, p0}, Lfu;->K(Landroid/view/View;Lqi3;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method
