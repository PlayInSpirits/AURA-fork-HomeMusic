.class public final synthetic Ldefpackage/hx0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# instance fields
.field public final synthetic a:Ldefpackage/ix0;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ix0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/hx0;->a:Ldefpackage/ix0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Ldefpackage/hx0;->a:Ldefpackage/ix0;

    .line 3
    .line 4
    iput-boolean v0, p0, Ldefpackage/ix0;->m:Z

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Ldefpackage/ix0;->o:J

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/ix0;->s(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
