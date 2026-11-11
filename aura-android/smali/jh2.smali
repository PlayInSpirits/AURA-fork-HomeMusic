.class public final Ljh2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Llx2;

.field public final synthetic p:Lnh2;


# direct methods
.method public synthetic constructor <init>(Lnh2;Llx2;I)V
    .locals 0

    .line 1
    iput p3, p0, Ljh2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ljh2;->p:Lnh2;

    .line 4
    .line 5
    iput-object p2, p0, Ljh2;->o:Llx2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Ljh2;->n:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    iget-object v1, p0, Ljh2;->o:Llx2;

    .line 5
    .line 6
    iget-object p0, p0, Ljh2;->p:Lnh2;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    iget-object v2, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ldw3;->a()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge p1, v2, :cond_0

    .line 36
    .line 37
    iget-object v1, v1, Llx2;->q:Ldy;

    .line 38
    .line 39
    iget-object v1, v1, Ldy;->n:Lix2;

    .line 40
    .line 41
    iget-object v1, v1, Lix2;->n:Ljava/util/Calendar;

    .line 42
    .line 43
    invoke-static {v1}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lix2;

    .line 51
    .line 52
    invoke-direct {p1, v1}, Lix2;-><init>(Ljava/util/Calendar;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lnh2;->i0(Lix2;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :pswitch_0
    iget-object p1, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    add-int/lit8 p1, p1, -0x1

    .line 72
    .line 73
    if-ltz p1, :cond_1

    .line 74
    .line 75
    iget-object v1, v1, Llx2;->q:Ldy;

    .line 76
    .line 77
    iget-object v1, v1, Ldy;->n:Lix2;

    .line 78
    .line 79
    iget-object v1, v1, Lix2;->n:Ljava/util/Calendar;

    .line 80
    .line 81
    invoke-static {v1}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 86
    .line 87
    .line 88
    new-instance p1, Lix2;

    .line 89
    .line 90
    invoke-direct {p1, v1}, Lix2;-><init>(Ljava/util/Calendar;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lnh2;->i0(Lix2;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
