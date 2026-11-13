.class public final synthetic Ldefpackage/qa4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/security/KeyChainAliasCallback;


# instance fields
.field public final synthetic a:Ldefpackage/ra4;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ra4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qa4;->a:Ldefpackage/ra4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final alias(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/qa4;->a:Ldefpackage/ra4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ra4;->B0:Ldefpackage/ey;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
