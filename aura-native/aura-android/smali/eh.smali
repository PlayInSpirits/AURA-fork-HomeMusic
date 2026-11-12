.class public final Leh;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:I

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Leh;->n:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh;->q:Ljava/lang/Object;

    iput-object p2, p0, Leh;->p:Ljava/lang/Object;

    iput p3, p0, Leh;->o:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 14
    iput p4, p0, Leh;->n:I

    iput-object p1, p0, Leh;->p:Ljava/lang/Object;

    iput-object p2, p0, Leh;->q:Ljava/lang/Object;

    iput p3, p0, Leh;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lv14;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Leh;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leh;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Leh;->o:I

    .line 10
    .line 11
    iput-object p3, p0, Leh;->p:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Leh;->n:I

    .line 2
    .line 3
    iget v1, p0, Leh;->o:I

    .line 4
    .line 5
    iget-object v2, p0, Leh;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Leh;->p:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ltp4;

    .line 13
    .line 14
    check-cast v2, Landroid/content/Intent;

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Ltp4;->a(Landroid/content/Intent;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast v2, Lv14;

    .line 21
    .line 22
    check-cast p0, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-virtual {v2, v1, p0}, Lv14;->a(ILandroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 29
    .line 30
    check-cast p0, Landroid/view/View;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {v2, p0, v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(Landroid/view/View;IZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    check-cast p0, Landroid/widget/TextView;

    .line 38
    .line 39
    check-cast v2, Landroid/graphics/Typeface;

    .line 40
    .line 41
    invoke-virtual {p0, v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
