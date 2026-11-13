.class public final Ldefpackage/bc;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/bc;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/bc;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/bc;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/bc;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast v1, Lcom/google/android/material/search/SearchBar;

    .line 10
    .line 11
    iget-object p0, v1, Lcom/google/android/material/search/SearchBar;->x0:Landroid/view/accessibility/AccessibilityManager;

    .line 12
    .line 13
    iget-object p1, v1, Lcom/google/android/material/search/SearchBar;->y0:Ldefpackage/ss2;

    .line 14
    .line 15
    new-instance v0, Ldefpackage/h3;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Ldefpackage/h3;-><init>(Ldefpackage/g3;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v1, Ldefpackage/lt1;

    .line 28
    .line 29
    sget-object p0, Ldefpackage/n61;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ldefpackage/lt1;->run()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    check-cast v1, Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/View;->requestApplyInsets()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_4
    check-cast v1, Ldefpackage/g11;

    .line 50
    .line 51
    iget-object p0, v1, Ldefpackage/g11;->G:Landroid/view/accessibility/AccessibilityManager;

    .line 52
    .line 53
    iget-object p1, v1, Ldefpackage/g11;->H:Ldefpackage/g3;

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    sget-object p1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    iget-object p1, v1, Ldefpackage/g11;->H:Ldefpackage/g3;

    .line 68
    .line 69
    new-instance v0, Ldefpackage/h3;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Ldefpackage/h3;-><init>(Ldefpackage/g3;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 75
    .line 76
    .line 77
    :cond_0
    :pswitch_5
    return-void

    .line 78
    :pswitch_6
    check-cast v1, Ldefpackage/jw;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iget-boolean p1, v1, Ldefpackage/jw;->n:Z

    .line 85
    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget-object p1, v1, Ldefpackage/jw;->r:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Ldefpackage/ac;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x1

    .line 100
    iput-boolean p0, v1, Ldefpackage/jw;->n:Z

    .line 101
    .line 102
    :cond_1
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/bc;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ldefpackage/bc;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    check-cast v3, Ldefpackage/sk4;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Ldefpackage/a32;->f(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast v3, Ldefpackage/b0;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, Ldefpackage/s65;->n:Ldefpackage/s65;

    .line 26
    .line 27
    invoke-static {p1, p0}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ldefpackage/aa4;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/view/ViewParent;

    .line 46
    .line 47
    instance-of v0, p1, Landroid/view/View;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    check-cast p1, Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const v0, 0x7f0a0323

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    check-cast p1, Ljava/lang/Boolean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object p1, v2

    .line 71
    :goto_0
    if-eqz p1, :cond_2

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move p1, v1

    .line 79
    :goto_1
    if-eqz p1, :cond_0

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual {v3}, Ldefpackage/b0;->d()V

    .line 83
    .line 84
    .line 85
    :goto_2
    return-void

    .line 86
    :pswitch_1
    check-cast v3, Ldefpackage/wk4;

    .line 87
    .line 88
    iget-object v0, v3, Ldefpackage/wk4;->B:Landroid/view/ViewTreeObserver;

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, v3, Ldefpackage/wk4;->B:Landroid/view/ViewTreeObserver;

    .line 103
    .line 104
    :cond_4
    iget-object v0, v3, Ldefpackage/wk4;->B:Landroid/view/ViewTreeObserver;

    .line 105
    .line 106
    iget-object v1, v3, Ldefpackage/wk4;->v:Ldefpackage/sg;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_2
    check-cast v3, Lcom/google/android/material/search/SearchBar;

    .line 116
    .line 117
    iget-object p0, v3, Lcom/google/android/material/search/SearchBar;->x0:Landroid/view/accessibility/AccessibilityManager;

    .line 118
    .line 119
    iget-object p1, v3, Lcom/google/android/material/search/SearchBar;->y0:Ldefpackage/ss2;

    .line 120
    .line 121
    new-instance v0, Ldefpackage/h3;

    .line 122
    .line 123
    invoke-direct {v0, p1}, Ldefpackage/h3;-><init>(Ldefpackage/g3;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast v3, Ldefpackage/lt1;

    .line 134
    .line 135
    sget-object p0, Ldefpackage/n61;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 136
    .line 137
    invoke-virtual {p0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :pswitch_4
    return-void

    .line 141
    :pswitch_5
    check-cast v3, Ldefpackage/g11;

    .line 142
    .line 143
    iget-object p0, v3, Ldefpackage/g11;->H:Ldefpackage/g3;

    .line 144
    .line 145
    if-eqz p0, :cond_6

    .line 146
    .line 147
    iget-object p1, v3, Ldefpackage/g11;->G:Landroid/view/accessibility/AccessibilityManager;

    .line 148
    .line 149
    if-eqz p1, :cond_6

    .line 150
    .line 151
    new-instance v0, Ldefpackage/h3;

    .line 152
    .line 153
    invoke-direct {v0, p0}, Ldefpackage/h3;-><init>(Ldefpackage/g3;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 157
    .line 158
    .line 159
    :cond_6
    return-void

    .line 160
    :pswitch_6
    check-cast v3, Ldefpackage/uz;

    .line 161
    .line 162
    iget-object v0, v3, Ldefpackage/uz;->K:Landroid/view/ViewTreeObserver;

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_7

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, v3, Ldefpackage/uz;->K:Landroid/view/ViewTreeObserver;

    .line 177
    .line 178
    :cond_7
    iget-object v0, v3, Ldefpackage/uz;->K:Landroid/view/ViewTreeObserver;

    .line 179
    .line 180
    iget-object v1, v3, Ldefpackage/uz;->v:Ldefpackage/sg;

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_7
    check-cast v3, Ldefpackage/jw;

    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iget-boolean p1, v3, Ldefpackage/jw;->n:Z

    .line 196
    .line 197
    if-eqz p1, :cond_9

    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    iget-object p1, v3, Ldefpackage/jw;->r:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Ldefpackage/ac;

    .line 206
    .line 207
    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 208
    .line 209
    .line 210
    iput-boolean v1, v3, Ldefpackage/jw;->n:Z

    .line 211
    .line 212
    :cond_9
    return-void

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
