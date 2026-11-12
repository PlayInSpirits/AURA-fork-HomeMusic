.class public final Lmh2;
.super Lrw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Llx2;

.field public final synthetic b:Lcom/google/android/material/button/MaterialButton;

.field public final synthetic c:Lnh2;


# direct methods
.method public constructor <init>(Lnh2;Llx2;Lcom/google/android/material/button/MaterialButton;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmh2;->c:Lnh2;

    .line 5
    .line 6
    iput-object p2, p0, Lmh2;->a:Llx2;

    .line 7
    .line 8
    iput-object p3, p0, Lmh2;->b:Lcom/google/android/material/button/MaterialButton;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lmh2;->b:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1, p0}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3

    .line 1
    iget-object p1, p0, Lmh2;->a:Llx2;

    .line 2
    .line 3
    iget-object p1, p1, Llx2;->q:Ldy;

    .line 4
    .line 5
    iget-object p3, p0, Lmh2;->c:Lnh2;

    .line 6
    .line 7
    iget-object v0, p3, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-gez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 27
    .line 28
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    :goto_0
    iget-object v0, p1, Ldy;->n:Lix2;

    .line 33
    .line 34
    iget-object v0, v0, Lix2;->n:Ljava/util/Calendar;

    .line 35
    .line 36
    invoke-static {v0}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->add(II)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lix2;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lix2;-><init>(Ljava/util/Calendar;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p3, Lnh2;->p0:Lix2;

    .line 50
    .line 51
    iget-object p1, p1, Ldy;->n:Lix2;

    .line 52
    .line 53
    iget-object p1, p1, Lix2;->n:Ljava/util/Calendar;

    .line 54
    .line 55
    invoke-static {p1}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, v1, p2}, Ljava/util/Calendar;->add(II)V

    .line 60
    .line 61
    .line 62
    const/4 p2, 0x5

    .line 63
    const/4 p3, 0x1

    .line 64
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p3}, Ljava/util/Calendar;->get(I)I

    .line 75
    .line 76
    .line 77
    const/4 p3, 0x7

    .line 78
    invoke-virtual {p1, p3}, Ljava/util/Calendar;->getMaximum(I)I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide p1

    .line 91
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    const-string v0, "yMMMM"

    .line 96
    .line 97
    invoke-static {v0, p3}, La35;->b(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    new-instance v0, Ljava/util/Date;

    .line 102
    .line 103
    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v0}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object p0, p0, Lmh2;->b:Lcom/google/android/material/button/MaterialButton;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method
