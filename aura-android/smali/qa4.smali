.class public final synthetic Lqa4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/security/KeyChainAliasCallback;


# instance fields
.field public final synthetic a:Lra4;


# direct methods
.method public synthetic constructor <init>(Lra4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqa4;->a:Lra4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final alias(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqa4;->a:Lra4;

    .line 2
    .line 3
    iget-object p0, p0, Lra4;->B0:Ley;

    .line 4
    .line 5
    iget-object p0, p0, Ley;->b:Ljava/lang/Object;

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
