.class public final synthetic Lzt3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Leu3;


# direct methods
.method public synthetic constructor <init>(Leu3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzt3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lzt3;->b:Leu3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iget p1, p0, Lzt3;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lzt3;->b:Leu3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Leu3;->J0:Lw12;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lw12;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroid/widget/ListView;

    .line 17
    .line 18
    const/16 p1, 0x8

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 27
    .line 28
    iget-object p1, p1, Lw12;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 31
    .line 32
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 39
    .line 40
    iget-object p1, p1, Lw12;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 43
    .line 44
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const-string p1, ""

    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p1}, Leu3;->o0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
