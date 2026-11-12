.class public final Lbq2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Llq2;


# direct methods
.method public synthetic constructor <init>(Llq2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbq2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lbq2;->o:Llq2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lbq2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lbq2;->o:Llq2;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Llq2;->w:Lwq2;

    .line 9
    .line 10
    invoke-virtual {p1}, Lwq2;->g()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Llq2;->t:Lyq2;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-static {p1}, Lyq2;->f(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
