.class public final Ly8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ly8;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ly8;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ly8;->o:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget p1, p0, Ly8;->n:I

    .line 2
    .line 3
    iget-object p2, p0, Ly8;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ly8;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Ljx2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljx2;->a()I

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    if-lt p3, p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljx2;->c()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-gt p3, p1, :cond_1

    .line 27
    .line 28
    check-cast p2, Llx2;

    .line 29
    .line 30
    iget-object p1, p2, Llx2;->s:Lom1;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Ljx2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, p3}, Ljx2;->b(I)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    iget-object p1, p1, Lom1;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lnh2;

    .line 47
    .line 48
    iget-object p4, p1, Lnh2;->o0:Ldy;

    .line 49
    .line 50
    iget-object p4, p4, Ldy;->p:Lpi0;

    .line 51
    .line 52
    iget-wide p4, p4, Lpi0;->n:J

    .line 53
    .line 54
    cmp-long p2, p2, p4

    .line 55
    .line 56
    if-ltz p2, :cond_1

    .line 57
    .line 58
    iget-object p2, p1, Lnh2;->n0:Lze4;

    .line 59
    .line 60
    iput-object p0, p2, Lze4;->n:Ljava/lang/Long;

    .line 61
    .line 62
    iget-object p0, p1, Lcg3;->l0:Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_0

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Lwh2;

    .line 79
    .line 80
    iget-object p3, p1, Lnh2;->n0:Lze4;

    .line 81
    .line 82
    iget-object p3, p3, Lze4;->n:Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {p2, p3}, Lwh2;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    iget-object p0, p1, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ldw3;->d()V

    .line 95
    .line 96
    .line 97
    iget-object p0, p1, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 98
    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Ldw3;->d()V

    .line 106
    .line 107
    .line 108
    :cond_1
    return-void

    .line 109
    :pswitch_0
    check-cast p2, La9;

    .line 110
    .line 111
    iget-object p1, p2, La9;->r:Landroid/content/DialogInterface$OnClickListener;

    .line 112
    .line 113
    check-cast p0, Ld9;

    .line 114
    .line 115
    iget-object p4, p0, Ld9;->b:Lf9;

    .line 116
    .line 117
    invoke-interface {p1, p4, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 118
    .line 119
    .line 120
    iget-boolean p1, p2, La9;->v:Z

    .line 121
    .line 122
    if-nez p1, :cond_2

    .line 123
    .line 124
    iget-object p0, p0, Ld9;->b:Lf9;

    .line 125
    .line 126
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 127
    .line 128
    .line 129
    :cond_2
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
