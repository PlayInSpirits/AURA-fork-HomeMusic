.class public final Lcom/eddyizm/tempus/homemusic/HubLeavePreference;
.super Landroidx/preference/Preference;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final l(Ldefpackage/rp3;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->l(Ldefpackage/rp3;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x1020016

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ldefpackage/rp3;->s(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, Landroid/widget/TextView;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/widget/TextView;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/preference/Preference;->n:Landroid/content/Context;

    .line 22
    .line 23
    const v0, 0x7f060077

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method
