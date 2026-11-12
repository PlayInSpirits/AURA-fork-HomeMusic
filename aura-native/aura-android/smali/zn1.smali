.class public final synthetic Lzn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lzn1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lzn1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget p1, p0, Lzn1;->a:I

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    const/4 v0, 0x1

    .line 5
    iget-object p0, p0, Lzn1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 11
    .line 12
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Lae1;

    .line 13
    .line 14
    iget-object p1, p1, Lae1;->m:Landroid/view/View;

    .line 15
    .line 16
    check-cast p1, Lcom/google/android/material/search/SearchView;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->getText()Landroid/text/Editable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, ""

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-le p2, v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->h0(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    move p3, v0

    .line 48
    :cond_0
    return p3

    .line 49
    :pswitch_0
    check-cast p0, Lgf1;

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    if-eq p2, p1, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x6

    .line 55
    if-eq p2, p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {p0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move p3, v0

    .line 62
    :goto_0
    return p3

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
