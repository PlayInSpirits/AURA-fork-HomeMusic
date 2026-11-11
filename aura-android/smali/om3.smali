.class public final synthetic Lom3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lom3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget p0, p0, Lom3;->a:I

    .line 2
    .line 3
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 4
    .line 5
    check-cast p2, Ljava/util/List;

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p0, p2, v0}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 17
    .line 18
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lau;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lau;->d(Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object p0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p0, p2, v0}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 30
    .line 31
    .line 32
    const p0, 0x7f1303df

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
